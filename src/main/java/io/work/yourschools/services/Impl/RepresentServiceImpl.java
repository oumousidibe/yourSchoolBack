package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.Etudiant;
import io.work.yourschools.entity.Representant;
import io.work.yourschools.exceptions.ResourceNotFoundException;
import io.work.yourschools.repositories.RepresentantRepository;
import io.work.yourschools.services.RendezVousService;
import io.work.yourschools.services.RepresentantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepresentServiceImpl implements RepresentantService {

    @Autowired
    private RepresentantRepository representantRepository;

    @Override
    public List<Representant> getAllRepresentant() {
        return representantRepository.findAll();
    }

    @Override
    public Representant saveRepresentant(Representant representant) {
        return representantRepository.save(representant);
    }

    @Override
    public Representant updateRepresentant(Representant representant) {
        return representantRepository.findById(representant.getId())
                .map(representant1 -> {
                    return representantRepository.saveAndFlush(representant);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Representant n'exite pas"));
    }

    @Override
    public void deleteRepresentant(Long id) {

        representantRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Representant n'exite pas"));

        representantRepository.deleteById(id);

    }
}
