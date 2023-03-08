package tn.aymax.saptechnique.kaddemproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
