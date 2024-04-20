package com.ProjectPsycology.ProjectPsycology.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idR;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRendezVous;

    public void setDate(Date dateRendezVous) {
        this.dateRendezVous = dateRendezVous;
    }

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne(mappedBy = "rendezVous", optional = false)
    private Consultation consultation;
    private boolean accepte;



    public void setAccepte(boolean accepte) {
        this.accepte = true;
    }

    public boolean isAccepte() {
        return accepte;
    }
}
