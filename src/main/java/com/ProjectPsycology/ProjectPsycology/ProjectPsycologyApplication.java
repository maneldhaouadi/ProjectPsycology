package com.ProjectPsycology.ProjectPsycology;


import com.ProjectPsycology.ProjectPsycology.Models.Consultation;
import com.ProjectPsycology.ProjectPsycology.Models.Evennement;
import com.ProjectPsycology.ProjectPsycology.Models.User;
import com.ProjectPsycology.ProjectPsycology.Repository.ConsultationRepository;
import com.ProjectPsycology.ProjectPsycology.Repository.EvenementRepository;
import com.ProjectPsycology.ProjectPsycology.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ProjectPsycology.ProjectPsycology.Models.ERole;


import java.util.Date;

@SpringBootApplication
public class ProjectPsycologyApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ConsultationRepository consultationRepository;

	@Autowired
	private EvenementRepository evenementRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectPsycologyApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// Création des utilisateurs
// Spécifier le rôle en utilisant l'énumération Role
// Spécifier le rôle en utilisant l'énumération ERole



	}









}

