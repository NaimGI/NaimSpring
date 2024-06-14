package tn.esprit.mouhamednaim.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mouhamednaim.entities.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {

}
