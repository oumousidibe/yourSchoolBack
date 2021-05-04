package io.work.yourschools.controller;

import io.work.yourschools.entity.Etablissement;
import io.work.yourschools.entity.Filiere;
import io.work.yourschools.services.EtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etablissement")
public class EtablissementController {

    @Autowired
    private EtablissementService etablissementService;

    @GetMapping
    public List<Etablissement> getAllEtablissement(){
        return etablissementService.getAllEtablissement();
    }

    @GetMapping("/recherchebynom/{nomEtablissement}")
    public Etablissement findEtablissementByName(@PathVariable String nomEtablissement){
        return etablissementService.findEtablissementByNom(nomEtablissement);
    }

    @GetMapping("/recherchebyfiliere/{id}")
    public List<Etablissement> findEtablissementByFiliere(@PathVariable Long id){
        return etablissementService.findEtablissementByFiliere(Filiere.builder()
                .id(id)
                .build());
    }

    @GetMapping("/recherchebyadresse/{adresse}")
    public List<Etablissement> findAllEtablissementByAdresse(@PathVariable String adresse){
        return etablissementService.findAllEtablissementByAdresse(adresse);
    }

    @PostMapping
    public Etablissement saveEtablissement(@RequestBody Etablissement etablissement){
        return etablissementService.saveEtablisement(etablissement);
    }

    @PutMapping
    public Etablissement updateEtablisement(@RequestBody Etablissement etablissement){
        return etablissementService.updateEtablissement(etablissement);
    }

    @DeleteMapping("/{id}")
    public void deleteEtablissement(@PathVariable Long id){
        etablissementService.deleteEtablissement(id);
    }
}
