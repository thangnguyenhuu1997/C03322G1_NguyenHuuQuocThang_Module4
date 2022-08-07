package vn.codegym.case_study.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.employee.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
