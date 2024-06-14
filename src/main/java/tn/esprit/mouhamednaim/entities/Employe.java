package tn.esprit.mouhamednaim.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String position;

    @ManyToOne
    @JsonIgnore
    private Company company;

    @OneToMany(mappedBy = "employe")
    private Set<Donation> donationsSet;

}
