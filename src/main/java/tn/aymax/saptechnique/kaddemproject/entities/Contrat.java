package tn.aymax.saptechnique.kaddemproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private int montantContrat;
    @ManyToOne
    Etudiant etudiant;

}
