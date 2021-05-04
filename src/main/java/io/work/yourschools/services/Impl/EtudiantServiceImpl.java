package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.Etudiant;
import io.work.yourschools.exceptions.ResourceNotFoundException;
import io.work.yourschools.repositories.EtudiantRepository;
import io.work.yourschools.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.findById(etudiant.getId())
                .map(etudiant1 -> {
                    return etudiantRepository.saveAndFlush(etudiant);
                })
                .orElseThrow(()-> new ResourceNotFoundException("l'etudiant n'existe pas"));
    }

    @Override
    public void deleteEtudiant(Long id) {

        etudiantRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("l'etudiant n'existe pas"));
        etudiantRepository.deleteById(id);
    }
}
