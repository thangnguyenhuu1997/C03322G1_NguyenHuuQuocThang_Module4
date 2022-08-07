package com.example.demo.service.facility;

import com.example.demo.model.facility.RentType;

import java.util.List;
import java.util.Optional;

public interface IRentTypeService {
    List<RentType> findAll();

    void save(RentType rentType);

    Optional<RentType> findById(Integer id);
}
