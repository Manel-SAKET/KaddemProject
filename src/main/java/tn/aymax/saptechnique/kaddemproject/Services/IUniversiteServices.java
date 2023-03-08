package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteServices {
    List<Universite> retrieveAllUniversite();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    public Optional<Universite> retrieveUniversite(Integer idUniversie);
}
