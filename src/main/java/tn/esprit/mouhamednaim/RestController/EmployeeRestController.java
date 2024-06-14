package tn.esprit.mouhamednaim.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mouhamednaim.Service.CompanyService;
import tn.esprit.mouhamednaim.Service.EmployeeService;
import tn.esprit.mouhamednaim.Service.Iemployee;
import tn.esprit.mouhamednaim.entities.Company;
import tn.esprit.mouhamednaim.entities.Employe;

@RestController
@AllArgsConstructor
public class EmployeeRestController {
    private EmployeeService employeeService;

    @PostMapping("/addEmploye")
    public Employe addEmployeAndAssignToCompany(
            @RequestBody Employe employe,
            @RequestParam String companyName) {
        Employe createdEmploye = employeeService.addEmployeAndAssignToCompany(employe, companyName);
        return createdEmploye;
    }
}
