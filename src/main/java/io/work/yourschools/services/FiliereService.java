package io.work.yourschools.services;

import io.work.yourschools.entity.Filiere;

import java.util.List;

public interface FiliereService {

    public List<Filiere> getAllFiliere();
    public Filiere saveFiliere(Filiere filiere);
    public Filiere updateFiliere(Filiere filiere);
    public void deleteFiliere(Long id);
}
