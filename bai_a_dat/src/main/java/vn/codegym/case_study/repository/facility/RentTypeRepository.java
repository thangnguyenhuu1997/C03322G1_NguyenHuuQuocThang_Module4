package vn.codegym.case_study.repository.facility;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.facility.RentType;

public interface RentTypeRepository extends JpaRepository<RentType, Integer> {
}
