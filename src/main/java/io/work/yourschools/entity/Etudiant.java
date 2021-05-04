package io.work.yourschools.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant extends Etablissement {

    private String niveauEtude;
    @ManyToMany
    @JoinTable(
            name = "etudiant_etablissement",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "etablissement_id")

    )
    private List<Etablissement> etablissements;
    @OneToMany(mappedBy = "etudiant")
    private List<RendezVous> rendezVousList;
    @OneToOne(mappedBy = "etudiant")
    private Validation validation;
}
