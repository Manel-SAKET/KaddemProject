package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Contrat;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;
import tn.aymax.saptechnique.kaddemproject.entities.Universite;
import tn.aymax.saptechnique.kaddemproject.repositories.DepartementRepository;
import tn.aymax.saptechnique.kaddemproject.repositories.UniversiteRepository;

import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices{
    public final UniversiteRepository universiterepository;
    private final DepartementRepository departementRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Optional<Universite> retrieveUniversite(Integer idUniversite) {
        return universiterepository.findById(idUniversite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiterepository.findAll();
    }

    // Les affectations = services avancées qui servent à concrétiser les jointures
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null); // why not retrieve ? //méthode optional
        Universite universite = universiterepository.findById(idUniversite).orElse(null); //méthode orElse
        universite.getDepartements().add(departement);
    }

    @Override
    public Map<String, Integer> getMontantContartEntreDeuxDate(int idUniv, ChronoLocalDate startDate, ChronoLocalDate endDate) {
        Universite univ = universiterepository.findById(idUniv).orElse(null);
        List<Departement> departementsUniv =  univ.getDepartements();
        List<Etudiant> etudiantsUniv = null;
        for (Departement d : departementsUniv) {
            etudiantsUniv.addAll(d.getEtudiants());
        }
        List<Contrat> contratsValidesUniv = null;
        for (Etudiant e: etudiantsUniv) {
            List<Contrat> contratsEudNonArchivesBetweenDates = e.getContrat().stream().filter(contrat -> contrat.getArchive() == Boolean.FALSE).
                    filter(contrat -> !(contrat.getDateDebutContrat().isAfter(endDate) || contrat.getDateFinContrat().isBefore(startDate))).collect(Collectors.toList());
            contratsValidesUniv.addAll(contratsEudNonArchivesBetweenDates);
        }
        Map<String,Integer> montant_contrat_map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (Contrat contrat: contratsValidesUniv) {
            montant_contrat_map.putIfAbsent(contrat.getSpecialite().toString(),montant_contrat_map.get(contrat.getSpecialite().toString())+contrat.getMontantContrat());
        }

        return montant_contrat_map;
    }
}

