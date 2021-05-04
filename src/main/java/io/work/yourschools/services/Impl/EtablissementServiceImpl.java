package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.Etablissement;
import io.work.yourschools.entity.Filiere;
import io.work.yourschools.exceptions.ResourceNotFoundException;
import io.work.yourschools.repositories.EtablissementRepository;
import io.work.yourschools.repositories.FiliereRepository;
import io.work.yourschools.services.EtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtablissementServiceImpl implements EtablissementService {

    @Autowired
    private EtablissementRepository etablissementRepository;
    @Autowired
    private FiliereRepository filiereRepository;

    @Override
    public List<Etablissement> getAllEtablissement() {
        return etablissementRepository.findAll();
    }

    @Override
    public Etablissement saveEtablisement(Etablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }

    @Override
    public Etablissement updateEtablissement(Etablissement etablissement) {
        return etablissementRepository.findById(etablissement.getId())
                .map(etablissement1 -> {
                    return etablissementRepository.saveAndFlush(etablissement);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Etablissement n'existe pas"));
    }

    @Override
    public void deleteEtablissement(Long id) {

        etablissementRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("L'etablissement n'existe pas"));

        etablissementRepository.deleteById(id);

    }

    @Override
    public Etablissement findEtablissementByNom(String nom) {
        return etablissementRepository.findByNomEtablissement(nom);
    }

    @Override
    public List<Etablissement> findAllEtablissementByAdresse(String adresse) {
        return etablissementRepository.findAllByAdresse(adresse);
    }

    @Override
    public List<Etablissement> findEtablissementByFiliere(Filiere filiere) {
        return etablissementRepository.findAllByFilieres(filiere);
    }

}
