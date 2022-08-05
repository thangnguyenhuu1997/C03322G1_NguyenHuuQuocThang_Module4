package vn.codegym.case_study.repository.facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.facility.Facility;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    Page<Facility> findAllByNameContainsOrOtherDescriptionContainsOrFacilityFreeContains(String name, String description, String free, Pageable pageable);
}
