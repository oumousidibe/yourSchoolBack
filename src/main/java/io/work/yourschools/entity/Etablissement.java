package io.work.yourschools.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etablissement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomEtablissement;
    private String adresse;
    private String description;
    private String contact;
    @ManyToMany(mappedBy = "etablissements")
    private List<Etudiant> etudiants;
    @ManyToMany(mappedBy = "etablissements")
    private List<Filiere> filieres;
    @OneToMany(mappedBy = "etablissement")
    private List<RendezVous> rendezVousList;
    @OneToOne
    private Representant representant;
    @OneToMany(mappedBy = "etablissement")
    private List<Validation> validations;
}
