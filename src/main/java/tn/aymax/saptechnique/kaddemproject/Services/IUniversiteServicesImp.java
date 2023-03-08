package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Universite;
import tn.aymax.saptechnique.kaddemproject.repositories.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices{
    public final UniversiteRepository universiterepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Optional<Universite> retrieveUniversite(Integer idUniversie) {
        return universiterepository.findById(idUniversie);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiterepository.findAll();
    }
}
