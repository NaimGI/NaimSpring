package tn.esprit.mouhamednaim.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mouhamednaim.Service.ICompany;
import tn.esprit.mouhamednaim.entities.Company;

@RestController
@AllArgsConstructor
public class CompanyRestController {

    private ICompany iCompany;

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company){
        return iCompany.addCompany(company);
    }
}
