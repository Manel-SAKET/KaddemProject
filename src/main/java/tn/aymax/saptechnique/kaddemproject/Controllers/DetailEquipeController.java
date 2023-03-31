package tn.aymax.saptechnique.kaddemproject.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IDetailEquipeServices;
import tn.aymax.saptechnique.kaddemproject.entities.DetailEquipe;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detailequipecontroller")
@RequiredArgsConstructor
public class DetailEquipeController {
    private final IDetailEquipeServices detailEquipeServices;

    @PostMapping("add")
    private DetailEquipe addDetailEquipe(@RequestBody DetailEquipe de){
        return detailEquipeServices.addDetailEquipe(de);
    }
    @PutMapping("update")
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe de){
        return detailEquipeServices.updateDetailEquipe(de);
    }
    @GetMapping("getall")
    private List<DetailEquipe> retrieveAllDetailsEquipe(){
        return detailEquipeServices.retrieveAllDetailsEquipe();
    }

    @DeleteMapping("/{id}")
    private void removeDetailEquipe(@PathVariable Integer idDetailEquipe){
        detailEquipeServices.removeDetailEquipe(idDetailEquipe);
    }
    @GetMapping("/{id}")
    public Optional<DetailEquipe> retrieveDetailEquipe(@PathVariable Integer idDetailEquipe){
        return detailEquipeServices.retrieveDetailEquipe(idDetailEquipe);
    }
}
