package tn.aymax.saptechnique.kaddemproject.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IUniversiteServices;
import tn.aymax.saptechnique.kaddemproject.entities.Universite;

import java.time.chrono.ChronoLocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universitecontroller")
public class UniversiteController {
    private final IUniversiteServices universiteServices;

    @GetMapping("getall")
    private List<Universite> retrieveAllUniversite(){
        return universiteServices.retrieveAllUniversite();
    }
    @PostMapping("add")
    private Universite addUniversite(@RequestBody Universite u){
        return universiteServices.addUniversite(u);
    }
    @PutMapping("update")
    private Universite updateUniversite(@RequestBody Universite u){
        return universiteServices.updateUniversite(u);
    }
    @GetMapping("/{id}")
    public Optional<Universite> retrieveUniversite(@PathVariable Integer idUniversie){
        return universiteServices.retrieveUniversite(idUniversie);
    }
    @PutMapping("/idu{}/{idd}")
    public void assignUniversiteToDepartement (@PathVariable Integer idUniversite,@PathVariable Integer idDepartement){
        universiteServices.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
    @GetMapping("/{idu}/{startdate}/{enddate}")
    public Map<String, Integer> getMontantContartEntreDeuxDate(@PathVariable int idUniv,@PathVariable ChronoLocalDate startDate,@PathVariable ChronoLocalDate endDate){
        return universiteServices.getMontantContartEntreDeuxDate(idUniv,startDate,endDate);
    }

}
