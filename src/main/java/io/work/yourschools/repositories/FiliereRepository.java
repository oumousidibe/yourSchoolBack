package io.work.yourschools.repositories;

import io.work.yourschools.entity.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FiliereRepository extends JpaRepository<Filiere , Long> {
    public Filiere findByNomFiliere(String nom);
}
