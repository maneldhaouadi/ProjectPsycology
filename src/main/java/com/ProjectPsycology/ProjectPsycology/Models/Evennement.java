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
@AllArgsConstructor
@NoArgsConstructor
public class Evennement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    private Date dateE;
    private String desciption;
    private String titre;



    public Evennement(Date date,String desciption,String titre){
        this.dateE=date;
        this.desciption=desciption;
        this.titre=titre;

    }
}
