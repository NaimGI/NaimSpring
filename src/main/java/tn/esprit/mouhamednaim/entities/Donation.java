package tn.esprit.mouhamednaim.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Donation {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private Long id;
    private Float amount;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private DonnationType donnationType;

    @ManyToOne
    @JsonIgnore
    private Employe employe;

    @ManyToOne
    @JsonIgnore
    private RedCresent redCresent;
}
