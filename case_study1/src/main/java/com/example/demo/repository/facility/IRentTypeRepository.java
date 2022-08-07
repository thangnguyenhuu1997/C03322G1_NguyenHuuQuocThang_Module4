package com.example.demo.repository.facility;

import com.example.demo.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
}
