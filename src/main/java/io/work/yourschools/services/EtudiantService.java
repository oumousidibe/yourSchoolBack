package io.work.yourschools.services;

import io.work.yourschools.entity.Etudiant;

import java.util.List;

public interface EtudiantService {
    public List<Etudiant> getAllEtudiant();
    public Etudiant saveEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long id);
}
