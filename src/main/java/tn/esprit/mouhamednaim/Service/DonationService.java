package tn.esprit.mouhamednaim.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mouhamednaim.Repository.DonationRepository;
import tn.esprit.mouhamednaim.entities.Donation;
import tn.esprit.mouhamednaim.entities.DonnationType;

@Service
@AllArgsConstructor
public class DonationService implements  IDonnation{
    DonationRepository donationRepository;

    @Override
    public Donation addDonation(Donation donation) {
        if (donation.getDonnationType() == null) {
            donation.setAmount(0.0F);
            donation.setDonnationType(DonnationType.valueOf("BLOOD"));
        } else {
            donation.setDonnationType(DonnationType.valueOf("MONETARY"));
        }
        return donationRepository.save(donation);
    }
}
