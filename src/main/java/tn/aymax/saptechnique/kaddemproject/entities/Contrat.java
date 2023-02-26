package tn.aymax.saptechnique.kaddemproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Contrat")
public class Contrat {
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