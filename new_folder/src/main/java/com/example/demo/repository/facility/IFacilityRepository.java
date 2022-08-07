package com.example.demo.repository.facility;

import com.example.demo.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
}
