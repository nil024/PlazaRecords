package com.TollPlazaRecords.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReqPayData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String msgId;
    private String orgId;
    private LocalDateTime timestamp;
    private String txnId;
    private String txnType;
    private LocalDateTime txnTs;
    
    private String plazaId;
    private String plazaGeocode;
    private String plazaName;
    private String plazaSubtype;
    private String plazaType;
    
    // Lane-related fields
    private String laneId;
    private String laneDirection;
    private String laneReaderId;
    private String laneStatus;
    private String laneMode;
    private String laneType;
    
    private String vehicleTID;
    private String vehicleTagId;
    private String vehicleWim;
    
    
    private String paymentCurr;
    private String paymentValue;
    private String paymentPriceMode;
    private String paymentMode;
    private String paymentIsOverWeightCharged;
    
	public ReqPayData() {
		super();
	}

	public ReqPayData(Long id, String msgId, String orgId, LocalDateTime timestamp, String txnId, String txnType,
			LocalDateTime txnTs, String plazaId, String plazaGeocode, String plazaName, String plazaSubtype,
			String plazaType, String laneId, String laneDirection, String laneReaderId, String laneStatus,
			String laneMode, String laneType, String vehicleTID, String vehicleTagId, String vehicleWim,
			String paymentCurr, String paymentValue, String paymentPriceMode, String paymentMode,
			String paymentIsOverWeightCharged) {
		super();
		this.id = id;
		this.msgId = msgId;
		this.orgId = orgId;
		this.timestamp = timestamp;
		this.txnId = txnId;
		this.txnType = txnType;
		this.txnTs = txnTs;
		this.plazaId = plazaId;
		this.plazaGeocode = plazaGeocode;
		this.plazaName = plazaName;
		this.plazaSubtype = plazaSubtype;
		this.plazaType = plazaType;
		this.laneId = laneId;
		this.laneDirection = laneDirection;
		this.laneReaderId = laneReaderId;
		this.laneStatus = laneStatus;
		this.laneMode = laneMode;
		this.laneType = laneType;
		this.vehicleTID = vehicleTID;
		this.vehicleTagId = vehicleTagId;
		this.vehicleWim = vehicleWim;
		this.paymentCurr = paymentCurr;
		this.paymentValue = paymentValue;
		this.paymentPriceMode = paymentPriceMode;
		this.paymentMode = paymentMode;
		this.paymentIsOverWeightCharged = paymentIsOverWeightCharged;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getMsgId() {
		return msgId;
	}



	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}



	public String getOrgId() {
		return orgId;
	}



	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}



	public LocalDateTime getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}



	public String getTxnId() {
		return txnId;
	}



	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}



	public String getTxnType() {
		return txnType;
	}



	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}



	public LocalDateTime getTxnTs() {
		return txnTs;
	}



	public void setTxnTs(LocalDateTime txnTs) {
		this.txnTs = txnTs;
	}
	
	



	public String getPlazaId() {
		return plazaId;
	}



	public void setPlazaId(String plazaId) {
		this.plazaId = plazaId;
	}



	public String getPlazaGeocode() {
		return plazaGeocode;
	}



	public void setPlazaGeocode(String plazaGeocode) {
		this.plazaGeocode = plazaGeocode;
	}



	public String getPlazaName() {
		return plazaName;
	}



	public void setPlazaName(String plazaName) {
		this.plazaName = plazaName;
	}



	public String getPlazaSubtype() {
		return plazaSubtype;
	}



	public void setPlazaSubtype(String plazaSubtype) {
		this.plazaSubtype = plazaSubtype;
	}



	public String getPlazaType() {
		return plazaType;
	}



	public void setPlazaType(String plazaType) {
		this.plazaType = plazaType;
	}


	public String getLaneId() {
		return laneId;
	}


	public void setLaneId(String laneId) {
		this.laneId = laneId;
	}


	public String getLaneDirection() {
		return laneDirection;
	}


	public void setLaneDirection(String laneDirection) {
		this.laneDirection = laneDirection;
	}


	public String getLaneReaderId() {
		return laneReaderId;
	}


	public void setLaneReaderId(String laneReaderId) {
		this.laneReaderId = laneReaderId;
	}


	public String getLaneStatus() {
		return laneStatus;
	}


	public void setLaneStatus(String laneStatus) {
		this.laneStatus = laneStatus;
	}


	public String getLaneMode() {
		return laneMode;
	}


	public void setLaneMode(String laneMode) {
		this.laneMode = laneMode;
	}


	public String getLaneType() {
		return laneType;
	}


	public void setLaneType(String laneType) {
		this.laneType = laneType;
	}


	public String getVehicleTID() {
		return vehicleTID;
	}


	public void setVehicleTID(String vehicleTID) {
		this.vehicleTID = vehicleTID;
	}


	public String getVehicleTagId() {
		return vehicleTagId;
	}


	public void setVehicleTagId(String vehicleTagId) {
		this.vehicleTagId = vehicleTagId;
	}


	public String getVehicleWim() {
		return vehicleWim;
	}


	public void setVehicleWim(String vehicleWim) {
		this.vehicleWim = vehicleWim;
	}

	public String getPaymentCurr() {
		return paymentCurr;
	}

	public void setPaymentCurr(String paymentCurr) {
		this.paymentCurr = paymentCurr;
	}

	public String getPaymentValue() {
		return paymentValue;
	}

	public void setPaymentValue(String paymentValue) {
		this.paymentValue = paymentValue;
	}

	public String getPaymentPriceMode() {
		return paymentPriceMode;
	}

	public void setPaymentPriceMode(String paymentPriceMode) {
		this.paymentPriceMode = paymentPriceMode;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentIsOverWeightCharged() {
		return paymentIsOverWeightCharged;
	}

	public void setPaymentIsOverWeightCharged(String paymentIsOverWeightCharged) {
		this.paymentIsOverWeightCharged = paymentIsOverWeightCharged;
	}

	@Override
	public String toString() {
		return "ReqPayData [id=" + id + ", msgId=" + msgId + ", orgId=" + orgId + ", timestamp=" + timestamp
				+ ", txnId=" + txnId + ", txnType=" + txnType + ", txnTs=" + txnTs + ", plazaId=" + plazaId
				+ ", plazaGeocode=" + plazaGeocode + ", plazaName=" + plazaName + ", plazaSubtype=" + plazaSubtype
				+ ", plazaType=" + plazaType + ", laneId=" + laneId + ", laneDirection=" + laneDirection
				+ ", laneReaderId=" + laneReaderId + ", laneStatus=" + laneStatus + ", laneMode=" + laneMode
				+ ", laneType=" + laneType + ", vehicleTID=" + vehicleTID + ", vehicleTagId=" + vehicleTagId
				+ ", vehicleWim=" + vehicleWim + ", paymentCurr=" + paymentCurr + ", paymentValue=" + paymentValue
				+ ", paymentPriceMode=" + paymentPriceMode + ", paymentMode=" + paymentMode
				+ ", paymentIsOverWeightCharged=" + paymentIsOverWeightCharged + "]";
	}

}
