package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.Departement;
import tn.aymax.saptechnique.kaddemproject.entities.Universite;

import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IUniversiteServices {
    List<Universite> retrieveAllUniversite();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    public Optional<Universite> retrieveUniversite(Integer idUniversie);
    public void assignUniversiteToDepartement (Integer idUniversite, Integer idDepartement);
    public Map<String, Integer> getMontantContartEntreDeuxDate(int idUniv, ChronoLocalDate startDate, ChronoLocalDate endDate);
}
