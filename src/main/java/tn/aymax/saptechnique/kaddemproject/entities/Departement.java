package tn.aymax.saptechnique.kaddemproject.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "departement")
    List<Etudiant> etudiants;

}