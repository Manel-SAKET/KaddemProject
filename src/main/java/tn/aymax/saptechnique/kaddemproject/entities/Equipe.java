package tn.aymax.saptechnique.kaddemproject.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipe  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
   @Enumerated(EnumType.STRING)
    private Niveau niveau;
   @ManyToMany
    List<Etudiant> etudiants;
   @OneToOne(mappedBy = "equipe")
    DetailEquipe detailEquipe;
}
