package tn.esprit.mouhamednaim.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RedCresent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long redCid;
    private String area;

    @OneToMany(mappedBy = "redCresent")
    private Set<Donation> donationsSet;
}
