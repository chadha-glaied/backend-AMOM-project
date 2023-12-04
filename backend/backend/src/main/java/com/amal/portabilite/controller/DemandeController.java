package com.amal.portabilite.controller;

import com.amal.portabilite.model.Demande;
import com.amal.portabilite.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/demande")
@CrossOrigin("*")
public class DemandeController {
    @Autowired
    private DemandeService demandeService;
    @PostMapping("/")
    public ResponseEntity<Demande> addDemande(@RequestBody Demande demande){
        Demande demandeAdd = demandeService.addDemande(demande);
        return ResponseEntity.ok(demandeAdd);
    }
    @GetMapping("/{demandeId}")
    public Demande getDemandeParId(@PathVariable("demandeId") Long demandeId){
        return demandeService.getDemande(demandeId);
    }

    @GetMapping("/")
    public List<Demande> getDemandes(){
        System.out.println(demandeService.getDemandes());
        return demandeService.getDemandes();
    }
    @PutMapping("/")
    public Demande updateDemande(@RequestBody Demande demande){
        return demandeService.updateDemande(demande);
    }
    @DeleteMapping("/{demandeId}")
    public void deleteDemande(@PathVariable("demandeId") Long demandeId){
        demandeService.deleteDemande(demandeId);
    }
}
