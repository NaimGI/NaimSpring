package tn.esprit.mouhamednaim.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mouhamednaim.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    public Company findByCompanyName(String name);

}
