package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;
import tn.aymax.saptechnique.kaddemproject.repositories.DepartementRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IDepartementServicesImp implements IDepartementServices {

    private final DepartementRepository departementRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d) ;
    }

    @Override
    public Optional<Departement> retrieveDepartement(Integer idDepartement) {
        return departementRepository.findById(idDepartement);
    }

}
