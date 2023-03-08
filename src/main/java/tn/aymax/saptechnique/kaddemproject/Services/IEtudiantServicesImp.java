package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;
import tn.aymax.saptechnique.kaddemproject.repositories.DepartementRepository;
import tn.aymax.saptechnique.kaddemproject.repositories.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices {
    private final EtudiantRepository etudiantRepository;
    private final DepartementRepository departementRepository;
    @Override
    public List<Etudiant> retreiveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Optional<Etudiant> retreiveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Departement departement = departementRepository.findById(departementId).orElse(null);
        etudiantRepository.findById(etudiantId).orElse(null).setDepartement(departement);
    }
}
