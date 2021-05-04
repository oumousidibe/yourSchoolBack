package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.RendezVous;
import io.work.yourschools.exceptions.ResourceNotFoundException;
import io.work.yourschools.repositories.RendezVousRepository;
import io.work.yourschools.services.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RendezVousServiceImpl implements RendezVousService {

    @Autowired
    private RendezVousRepository rendezVousRepository;

    @Override
    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public void deleteRendezVous(Long id) {

        rendezVousRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("rendez vous n'existe pas"));

        rendezVousRepository.deleteById(id);

    }
}
