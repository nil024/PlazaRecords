package com.TollPlazaRecords.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TollPlazaRecords.Entity.ReqPayData;
import com.TollPlazaRecords.Services.RequestPayDataService;

@RestController
public class ReqPayDataController {
	
	@Autowired
    private RequestPayDataService requestPayDataService;
	
	
	@PostMapping(value = "/saveReqPay", consumes = "application/xml", produces = "application/json")
    public ResponseEntity<ReqPayData> saveReqPay(@RequestBody String xmlPayload) {
        try {
            ReqPayData savedData = requestPayDataService.saveReqPayData(xmlPayload);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedData);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
