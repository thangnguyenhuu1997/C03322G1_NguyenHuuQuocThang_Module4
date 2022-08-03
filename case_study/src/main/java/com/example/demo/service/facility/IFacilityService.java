package com.example.demo.service.facility;

import com.example.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageble);

    List<Facility> findAll();

    void save(Facility facility);

    Optional<Facility> findById(Integer id);

    void update(Facility facility);

    void remove(Facility facility);
}
