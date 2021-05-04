package io.work.yourschools.repositories;

import io.work.yourschools.entity.Representant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepresentantRepository extends JpaRepository<Representant , Long> {
}
