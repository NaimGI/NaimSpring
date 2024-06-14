package tn.esprit.mouhamednaim.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mouhamednaim.entities.Employe;

public interface EmployeeRepository extends JpaRepository<Employe,Long> {
}
