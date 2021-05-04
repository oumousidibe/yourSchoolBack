package io.work.yourschools.services;

import io.work.yourschools.entity.Etablissement;
import io.work.yourschools.entity.Filiere;

import java.util.List;

public interface EtablissementService {

    public List<Etablissement> getAllEtablissement();
    public Etablissement saveEtablisement(Etablissement etablissement);
    public Etablissement updateEtablissement(Etablissement etablissement);
    public void deleteEtablissement(Long id);
    public Etablissement findEtablissementByNom(String nom);
    public List<Etablissement> findAllEtablissementByAdresse(String adresse);
    public List<Etablissement> findEtablissementByFiliere(Filiere filiere);
}
