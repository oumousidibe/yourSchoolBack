package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.Filiere;
import io.work.yourschools.exceptions.ResourceNotFoundException;
import io.work.yourschools.repositories.FiliereRepository;
import io.work.yourschools.services.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FiliereServiceImpl implements FiliereService {
    @Autowired
    private FiliereRepository filiereRepository;

    @Override
    public List<Filiere> getAllFiliere() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere saveFiliere(Filiere filiere) {
        return filiereRepository.save(filiere);
    }

    @Override
    public Filiere updateFiliere(Filiere filiere) {
        return filiereRepository.findById(filiere.getId())
                .map(filiere1 -> {
                    return filiereRepository.saveAndFlush(filiere);
                })
                .orElseThrow(()-> new ResourceNotFoundException("cette filiere n'existe pas"));
    }

    @Override
    public void deleteFiliere(Long id) {

        filiereRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cette filiere n'existe pas"));

        filiereRepository.deleteById(id);
    }
}
