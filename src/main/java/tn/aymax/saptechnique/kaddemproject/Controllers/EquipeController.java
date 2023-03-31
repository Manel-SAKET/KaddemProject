package tn.aymax.saptechnique.kaddemproject.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IEquipeServices;
import tn.aymax.saptechnique.kaddemproject.entities.Equipe;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("equipecontroller")
public class EquipeController {
    private final IEquipeServices equipeServices;
   @GetMapping("getall")
    private List<Equipe> retrieveAllEquipes(){
        return equipeServices.retrieveAllEquipes();
    }
    @PostMapping("add")
    private Equipe addEquipe(@RequestBody Equipe e){
        return equipeServices.addEquipe(e);
    }
    @PutMapping("update")
   private Equipe updateEquipe(@RequestBody Equipe e){
        return equipeServices.updateEquipe(e);
   }
   @GetMapping("/{id}")
   private Optional<Equipe> retrieveEquipe(@PathVariable Integer idEquipe){
        return equipeServices.retrieveEquipe(idEquipe);
    }
}

