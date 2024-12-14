package com.TollPlazaRecords.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TollPlazaRecords.Entity.Lane;
import com.TollPlazaRecords.Repository.LaneRepository;
import com.TollPlazaRecords.Services.LaneService;

@Service
public class LaneServiceImpl implements LaneService {
	@Autowired
	private LaneRepository laneRepository;

	@Override
	public Lane addLane(Lane lane) {
		Lane lane2 = laneRepository.save(lane);
		return lane2;
	}

}
