package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.Equipe;

import java.util.List;
import java.util.Optional;

public interface IEquipeServices {
    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e);

    Equipe updateEquipe(Equipe e);
    Optional<Equipe> retrieveEquipe(Integer idEquipe);
}
