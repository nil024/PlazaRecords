package com.TollPlazaRecords.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TollPlazaRecords.Entity.PlazaOnboarding;
import com.TollPlazaRecords.Repository.TollPlazaRepository;
import com.TollPlazaRecords.Services.TollPlazaService;

@Service
public class TollPlazaServicesImpl implements TollPlazaService{
	@Autowired
	private TollPlazaRepository tollPlazaRepository;

	@Override
	public PlazaOnboarding createPlzaza(PlazaOnboarding onboarding) {
		
		PlazaOnboarding onboarding2 = tollPlazaRepository.save(onboarding);
		return onboarding2;
	}
	
	public List<PlazaOnboarding> plazaList(){
		return tollPlazaRepository.findAll();
		
	}

	@Override
	public void validatePlazaExistsById(Long plaza_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validatePlazaExistsByName(String plaza_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validatePlazaExistsByOrgId(Long org_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validatePlazaExistsByGeoCode(String geoCode) {
		// TODO Auto-generated method stub
		
	}
	
}
