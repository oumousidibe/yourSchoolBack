package io.work.yourschools.services;

import io.work.yourschools.entity.RendezVous;

import java.util.List;

public interface RendezVousService {

    public List<RendezVous> getAllRendezVous();
    public RendezVous saveRendezVous(RendezVous rendezVous);
    public void deleteRendezVous(Long id);
}
