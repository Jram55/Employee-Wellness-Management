package Employee_wellfare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee_wellfare.entity.Employee;
import Employee_wellfare.entity.Event;
import Employee_wellfare.entity.EventRegistration;

@Repository
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Long>{

	
	Optional<EventRegistration> findByEmployeeAndEvent(Employee employee,Event event);
	
}
