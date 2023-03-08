package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.Contrat;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IContratServices {
    List<Contrat> retrieveAllContrats();
    Contrat updateContrat(Contrat ce);
    Contrat addContrat(Contrat ce);
    Optional<Contrat> retrieveContrat (Integer idContrat);
    void removeContrat(Integer idContrat);

}
