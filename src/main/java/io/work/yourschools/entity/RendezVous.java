package io.work.yourschools.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date_rv;
    @JsonIgnore
    @ManyToOne
    private Etablissement etablissement;
    @JsonIgnore
    @ManyToOne
    private Representant representant;
    @JsonIgnore
    @ManyToOne
    private Etudiant etudiant;

}
