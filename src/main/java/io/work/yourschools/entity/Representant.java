package io.work.yourschools.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Representant extends Utilisateur {

    private String fonction;
    @OneToMany(mappedBy = "etablissement")
    private List<RendezVous> rendezVousList;
    @OneToOne
    private Etablissement etablissement;
}
