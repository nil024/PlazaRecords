package com.TollPlazaRecords.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TollPlazaRecords.Entity.PlazaOnboarding;

@Service
public interface TollPlazaService {
	
	public PlazaOnboarding createPlzaza(PlazaOnboarding onboarding);
	
	public List<PlazaOnboarding> plazaList();
	
	void validatePlazaExistsById(Long plaza_id);  // Method declaration
    void validatePlazaExistsByName(String plaza_name);
    void validatePlazaExistsByOrgId(Long org_id);
    void validatePlazaExistsByGeoCode(String geoCode);

}
