package io.work.yourschools.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Validation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date_validation;
    @OneToOne
    private Etudiant etudiant;
    @ManyToOne
    private Etablissement etablissement;
}
