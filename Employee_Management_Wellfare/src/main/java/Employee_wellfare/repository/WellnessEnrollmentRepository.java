package Employee_wellfare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee_wellfare.entity.Employee;
import Employee_wellfare.entity.WellnessEnrollment;
import Employee_wellfare.entity.WellnessProgram;

@Repository
public interface WellnessEnrollmentRepository extends JpaRepository<WellnessEnrollment, Long>{

	List<WellnessEnrollment> findByEmployeeEmployeeId(Long employeeId);
 
	Optional<WellnessEnrollment> findByEmployeeAndWellnessProgram(Employee employee, WellnessProgram wellnessProgram);
}
