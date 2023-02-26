package tn.aymax.saptechnique.kaddemproject.entities;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne
    Equipe equipe;
}
