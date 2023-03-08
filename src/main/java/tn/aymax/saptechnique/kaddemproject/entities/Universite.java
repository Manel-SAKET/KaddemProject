package tn.aymax.saptechnique.kaddemproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniv;
    private String nomUniv;
    @OneToMany
    List<Departement> departement;
}
