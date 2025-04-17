package Employee_wellfare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee_wellfare.entity.Challenge;
import Employee_wellfare.entity.ChallengeParticipation;
import Employee_wellfare.entity.Employee;

@Repository
public interface ChallengeParticipationRepository extends JpaRepository<ChallengeParticipation, Long>{

	//List<ChallengeParticipation> findByEmployeeId(Long employeeId);

	List<ChallengeParticipation> findByEmployeeEmployeeId(Long employeeId);

	Optional<ChallengeParticipation> findByEmployeeAndChallenge(Employee employee, Challenge challenge);

}
