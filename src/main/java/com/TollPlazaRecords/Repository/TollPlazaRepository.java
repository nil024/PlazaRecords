package com.TollPlazaRecords.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.TollPlazaRecords.Entity.PlazaOnboarding;

@Repository
public interface TollPlazaRepository extends JpaRepository<PlazaOnboarding, Long>{

}
