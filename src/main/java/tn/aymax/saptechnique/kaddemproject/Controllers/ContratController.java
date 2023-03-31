package tn.aymax.saptechnique.kaddemproject.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IContratServices;
import tn.aymax.saptechnique.kaddemproject.entities.Contrat;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContratServices contratServices;
    @GetMapping("getall")
    private List<Contrat> retrieveAllContrats(){
        return contratServices.retrieveAllContrats();
    }
   @PutMapping("update")
    private Contrat updateContrat(@RequestBody Contrat ce){
        return contratServices.updateContrat(ce);
   }
  @PostMapping("add")
   private Contrat addContrat(@RequestBody Contrat ce){
        return contratServices.addContrat(ce);
    }
    @GetMapping("/{idContrat}")
    private Optional<Contrat> retrieveContrat (@PathVariable Integer idContrat){
        return contratServices.retrieveContrat(idContrat);
    }
    @DeleteMapping("/{idContrat}")
    private void removeContrat(@PathVariable Integer idContrat){
        contratServices.removeContrat(idContrat);
    }
    @Scheduled(cron = "0 0 13 * * ?")
    @GetMapping("getupdatestatus")
    private String retrieveAndUpdateStatusContrat(){
        return contratServices.retrieveAndUpdateStatusContrat();
    }
}
