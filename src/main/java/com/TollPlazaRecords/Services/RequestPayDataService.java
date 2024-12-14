package com.TollPlazaRecords.Services;

import com.TollPlazaRecords.Entity.ReqPayData;

public interface RequestPayDataService {
	
	public ReqPayData saveReqPayData(String xmlPayload) throws Exception;

}
