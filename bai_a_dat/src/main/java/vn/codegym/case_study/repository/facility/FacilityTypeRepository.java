package vn.codegym.case_study.repository.facility;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.facility.FacilityType;

public interface FacilityTypeRepository extends JpaRepository<FacilityType, Integer> {
}
