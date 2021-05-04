package io.work.yourschools.repositories;

import io.work.yourschools.entity.Etablissement;
import io.work.yourschools.entity.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtablissementRepository extends JpaRepository<Etablissement , Long > {
    public Etablissement findByNomEtablissement(String nom);
    public List<Etablissement> findAllByAdresse(String adresse);
    public List<Etablissement> findAllByFilieres(Filiere filiere);

}
