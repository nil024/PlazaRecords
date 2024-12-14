package com.TollPlazaRecords.ServicesImpl;

import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TollPlazaRecords.Entity.ReqPayData;
import com.TollPlazaRecords.Model.ReqPay;
import com.TollPlazaRecords.Repository.ReqPayDataRepository;
import com.TollPlazaRecords.Repository.TollPlazaRepository;
import com.TollPlazaRecords.Services.RequestPayDataService;
import com.TollPlazaRecords.Services.TollPlazaService;

@Service
public class RequestPayDataServiceImpl implements RequestPayDataService {

    @Autowired
    private ReqPayDataRepository reqPayDataRepository;
    
//    @Autowired
//    private TollPlazaRepository tollPlazaRepository;
    
    @Autowired
    private TollPlazaService plazaService;

    @Override
    public ReqPayData saveReqPayData(String xmlPayload) throws Exception {
        try {
            // Parse XML to Java object
            JAXBContext context = JAXBContext.newInstance(ReqPay.class);
            ReqPay reqPay = (ReqPay) context.createUnmarshaller().unmarshal(new StringReader(xmlPayload));
            
            
            //----------------------------------------added new lines-------------------------------------------
            // Validate each field separately
            
            
          //----------------------------------------added new lines-------------------------------------------

            // Map ReqPay to ReqPayData
            ReqPayData data = new ReqPayData();
            data.setMsgId(reqPay.getHead().getMsgId());
            data.setOrgId(reqPay.getHead().getOrgId());
            data.setTimestamp(LocalDateTime.parse(reqPay.getHead().getTs(), DateTimeFormatter.ISO_DATE_TIME));
            data.setTxnId(reqPay.getTxn().getTxnId());
            data.setTxnType(reqPay.getTxn().getTxnType());
            data.setTxnTs(LocalDateTime.parse(reqPay.getTxn().getTxnTs(), DateTimeFormatter.ISO_DATE_TIME));
            data.setPlazaId(reqPay.getPlaza().getPlazaId());
            data.setPlazaGeocode(reqPay.getPlaza().getPlazaGeocode());
            data.setPlazaName(reqPay.getPlaza().getPlazaName());
            data.setPlazaSubtype(reqPay.getPlaza().getPlazaSubtype());
            data.setPlazaType(reqPay.getPlaza().getPlazaType());

            // Extract Lane data
            if (reqPay.getPlaza().getLanes() != null && !reqPay.getPlaza().getLanes().isEmpty()) {
                ReqPay.Plaza.Lane lane = reqPay.getPlaza().getLanes().get(0);
                data.setLaneId(lane.getLaneId());
                data.setLaneDirection(lane.getLaneDirection());
                data.setLaneReaderId(lane.getLaneReaderId());
                data.setLaneStatus(lane.getLaneStatus());
                data.setLaneMode(lane.getLaneMode());
                data.setLaneType(lane.getLaneType());
            }

            // Extract Vehicle data
            if (reqPay.getVehicle() != null) {
                data.setVehicleTID(reqPay.getVehicle().getTID());
                data.setVehicleTagId(reqPay.getVehicle().getTagId());
                data.setVehicleWim(reqPay.getVehicle().getWim());
            }

            // Extract Payment and Amount data
            if (reqPay.getPayment() != null && reqPay.getPayment().getAmount() != null) {
                ReqPay.Payment.Amount amount = reqPay.getPayment().getAmount();
                data.setPaymentCurr(amount.getCurr());
                data.setPaymentValue(amount.getValue());
                data.setPaymentPriceMode(amount.getPriceMode());
                data.setPaymentMode(amount.getPaymentMode());
                data.setPaymentIsOverWeightCharged(amount.getIsOverWeightCharged());
            }

            // Save to the repository
           return reqPayDataRepository.save(data);
        } catch (JAXBException e) {
            throw new Exception("Error processing XML payload", e);
        }
    }

	

}
