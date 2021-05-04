package io.work.yourschools.services;

import io.work.yourschools.entity.Validation;

import java.util.List;

public interface ValidationService {

    public List<Validation> getAllValidation();
    public Validation saveValidation(Validation validation);
    public Validation updateValidation(Validation validation);
    public void deleteValidation(Long id);
}
