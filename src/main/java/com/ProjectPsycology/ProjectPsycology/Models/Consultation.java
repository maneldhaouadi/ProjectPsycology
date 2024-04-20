package com.ProjectPsycology.ProjectPsycology.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Consultation {
    public Consultation(Integer idC, RendezVous rendezVous) {
        this.idC = idC;
        this.rendezVous = rendezVous;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idC;

    @OneToOne
    @JoinColumn(name="rendezVous_id")
    private RendezVous rendezVous;








}
