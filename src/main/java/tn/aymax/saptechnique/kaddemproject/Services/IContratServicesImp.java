package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Contrat;
import tn.aymax.saptechnique.kaddemproject.repositories.ContratRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IContratServicesImp implements IContratServices {
    private final ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Optional<Contrat> retrieveContrat(Integer idContrat) {
        return contratRepository.findById(idContrat);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    @Transactional
    @Scheduled(cron = "0 0 13 * * ?")
    public String retrieveAndUpdateStatusContrat() {
        List<Contrat> contrats = contratRepository.getContratsexpirantdans15jours();
        String s = "";
        for (Contrat c: contrats) {
            if (c.getDateFinContrat().isEqual(LocalDate.now())){
                c.setArchive(Boolean.TRUE);
                contratRepository.saveAndFlush(c);
            }
            s+=c.getDateFinContrat()+"-"+c.getSpecialite()+"-Etudiant: "+c.getEtudiant().getNomE()+" "+c.getEtudiant().getPrenomE()+"\n";
        }
        return s;
    }
}
