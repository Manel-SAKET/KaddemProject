package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.Departement;

import java.util.List;
import java.util.Optional;

public interface IDepartementServices {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement(Departement d);
    Departement updateDepartement(Departement d);

    Optional<Departement> retrieveDepartement(Integer idDepartement);
}
