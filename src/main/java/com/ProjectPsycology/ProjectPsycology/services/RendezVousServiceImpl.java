package com.ProjectPsycology.ProjectPsycology.services;

import com.ProjectPsycology.ProjectPsycology.Models.ERole;
import com.ProjectPsycology.ProjectPsycology.Models.RendezVous;
import com.ProjectPsycology.ProjectPsycology.Repository.ConsultationRepository;
import com.ProjectPsycology.ProjectPsycology.Repository.RendezVousRepository;
import com.ProjectPsycology.ProjectPsycology.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RendezVousServiceImpl {
    @Autowired
    private RendezVousRepository rendezVousRepository;
    @Autowired
    private ConsultationRepository consultationRepository;
    @Autowired
    private UserRepository userRepository;
    private ERole ERoleRepository;

    public RendezVous passerRendezVous(User user, Date dateRendezVous) {
        ERole role=ERoleRepository;
        if (ERole.findByRoleNumber(role.getRoleNumber()).equals(3)) {
            RendezVous rendezVous = new RendezVous();
            rendezVous.setDateRendezVous(dateRendezVous);

            return rendezVousRepository.save(rendezVous);
        } else {
            System.out.println("Seuls les étudiants sont autorisés à prendre des rendez-vous.");
        }
        return null;
    }
    public void accepterRendezVous(RendezVous rendezVous, User user) {
        ERole role=ERoleRepository;
        if (ERole.findByRoleNumber(role.getRoleNumber()).equals(2)) {
            rendezVous.setAccepte(true);
            rendezVousRepository.save(rendezVous);
        } else {
            System.out.println("Seuls les médecins sont autorisés à accepter des rendez-vous.");
        }
    }
}
