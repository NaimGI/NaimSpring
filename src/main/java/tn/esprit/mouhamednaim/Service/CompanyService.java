package tn.esprit.mouhamednaim.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mouhamednaim.Repository.CompanyRepository;
import tn.esprit.mouhamednaim.entities.Company;

@Service
@AllArgsConstructor
public class CompanyService  implements ICompany{
  private CompanyRepository companyRepository;

    @Override
    public Company addCompany(Company company) {
        Company companyCreated = companyRepository.save(company);
        return companyCreated;
    }
}
