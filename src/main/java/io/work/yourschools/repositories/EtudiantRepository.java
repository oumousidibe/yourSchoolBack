package io.work.yourschools.repositories;

import io.work.yourschools.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant , Long> {
}
