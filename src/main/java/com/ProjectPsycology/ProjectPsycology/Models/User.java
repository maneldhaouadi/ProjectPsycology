package com.ProjectPsycology.ProjectPsycology.Models;

import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public User( String username, String email, String password, String firstname, String lastname, Date birthdate, String address, String phone, ERole role6, List<RendezVous> rendezVousList) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.role = role;
        this.rendezVousList = rendezVousList;
    }

    private String username;

    private String email;

    private String password;

    private String firstname;

    private String lastname;

    private Date birthdate;

    private String address;

    private String phone;

    // Utilisation de l'énumération Role pour l'attribut role
    @Enumerated(EnumType.STRING)
    private ERole role;







    public ERole getRole() {
        return this.role;
    }



    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "rendez_vous",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "consultation_id")
    )*/

    @OneToMany(mappedBy = "user")
    private List<RendezVous> rendezVousList = new ArrayList<>();

    /*private Set<Consultation> consultationsList = new HashSet<>();

    public Set<Consultation> getConsultations() {

        return this.consultationsList;
    }*/



    /*public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }*/
}

