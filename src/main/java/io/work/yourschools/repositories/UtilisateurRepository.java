package io.work.yourschools.repositories;

import io.work.yourschools.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long> {
}
