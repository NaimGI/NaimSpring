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
public class Company {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private Long companyId;
    private String companyName;
    private String companyAddress;

    @OneToMany(mappedBy = "company")
    private Set<Employe> employesSet;

}
