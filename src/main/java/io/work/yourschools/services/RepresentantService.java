package io.work.yourschools.services;

import io.work.yourschools.entity.Etudiant;
import io.work.yourschools.entity.Representant;

import java.util.List;

public interface RepresentantService {

    public List<Representant> getAllRepresentant();
    public Representant saveRepresentant(Representant representant);
    public Representant updateRepresentant(Representant representant);
    public void deleteRepresentant(Long id);
}
