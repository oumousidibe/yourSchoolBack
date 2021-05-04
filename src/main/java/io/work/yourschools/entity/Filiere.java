package io.work.yourschools.entity;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Filiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nomFiliere;
    private String description;
    private Integer montantMensuel;
    private String cycle;
    private Integer fraisInscription;
    @ManyToMany
    @JoinTable(
            name = "filiere_etablissement",
            joinColumns = @JoinColumn(name = "filiere_id"),
            inverseJoinColumns = @JoinColumn(name = "etablissement_id")

    )
    private List<Etablissement> etablissements;


}
