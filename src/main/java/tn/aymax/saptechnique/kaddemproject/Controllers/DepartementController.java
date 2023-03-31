package tn.aymax.saptechnique.kaddemproject.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.saptechnique.kaddemproject.Services.IDepartementServices;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departController")
@RequiredArgsConstructor
public class DepartementController {
    private final IDepartementServices departementServices;
    @GetMapping("getall")
    private List<Departement> retrieveAllDepartements(){
        return departementServices.retrieveAllDepartements();
    }
    @PostMapping("add")
    private Departement addDepartment(@RequestBody Departement d){
       return departementServices.addDepartement(d);
    }

    @PutMapping("update")
    private Departement updateDepartement (@RequestBody Departement d){
       return departementServices.updateDepartement(d);
    }

    @GetMapping("/{id}")
    private Optional<Departement> retrieveDepartement(@PathVariable Integer idDepartement){
       return departementServices.retrieveDepartement(idDepartement);
    }
}
