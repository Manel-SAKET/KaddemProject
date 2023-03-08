package tn.aymax.saptechnique.kaddemproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
//@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    int idEtudiant;
    String prenomE;
    String nomE;
    @Enumerated(EnumType.STRING)
    Option option;
    @ManyToOne
    private Departement departement;
    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrat;
    @ManyToMany(mappedBy = "etudiants")
    List<Equipe> equipe;
}
