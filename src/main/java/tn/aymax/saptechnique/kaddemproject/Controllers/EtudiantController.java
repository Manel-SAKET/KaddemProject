package tn.aymax.saptechnique.kaddemproject.Controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IEtudiantServices;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantController {
    private final IEtudiantServices etudiantServices;
   @GetMapping
    private List<Etudiant> retreiveAllEtudiants(){
        return etudiantServices.retreiveAllEtudiants();
    }

    @PostMapping("add")
    private Etudiant addEtudiant(@RequestBody Etudiant e){ //@RequestBody????
        return etudiantServices.addEtudiant(e);
    }

    @PutMapping
    public Etudiant updateEtudiant(Etudiant e){ //??????????
       return etudiantServices.updateEtudiant(e);
    }
    @JsonIgnore
    @GetMapping("/{idEtudiant}") //??
    public Optional<Etudiant> retreiveEtudiant (@PathVariable int idEtudiant){
       return etudiantServices.retreiveEtudiant(idEtudiant);
    }
    @DeleteMapping("/{idEtudiant}")
    void removeEtudiant(@PathVariable int idEtudiant){
       etudiantServices.removeEtudiant(idEtudiant);
    }
    @PutMapping("/{etudiantId}/{departementId}") //get ????????????????????????????
    public void assignEtudiantToDepartement (@PathVariable int etudiantId ,@PathVariable int departementId ){
       etudiantServices.assignEtudiantToDepartement(etudiantId,departementId);
    }
}
