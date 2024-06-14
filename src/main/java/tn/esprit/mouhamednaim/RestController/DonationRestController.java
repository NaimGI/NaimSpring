package tn.esprit.mouhamednaim.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mouhamednaim.Service.ICompany;
import tn.esprit.mouhamednaim.Service.IDonnation;
import tn.esprit.mouhamednaim.entities.Company;
import tn.esprit.mouhamednaim.entities.Donation;

@RestController
@AllArgsConstructor
public class DonationRestController {
    private IDonnation IDonnation;

    @PostMapping("/addDonation")
    public Donation addDonation(@RequestBody Donation donation){
        return IDonnation.addDonation(donation);
    }
}
