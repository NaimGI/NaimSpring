package tn.esprit.mouhamednaim.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mouhamednaim.Repository.CompanyRepository;
import tn.esprit.mouhamednaim.Repository.EmployeeRepository;
import tn.esprit.mouhamednaim.entities.Employe;

@Service
@AllArgsConstructor
public class EmployeeService implements Iemployee {
    CompanyRepository companyRepository;
    EmployeeRepository employeeRepository;
    @Override
    public Employe addEmployeAndAssignToCompany(Employe employe, String campanyName) {
        var companyExist = companyRepository.findByCompanyName(campanyName);
        employe.setCompany(companyExist);
        var createdEmploye = employeeRepository.save(employe);
        return  createdEmploye;
    }
}
