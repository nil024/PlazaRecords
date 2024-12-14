package com.TollPlazaRecords.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TollPlazaRecords.Entity.Lane;

@Repository
public interface LaneRepository extends JpaRepository<Lane, Long> {
	
}
