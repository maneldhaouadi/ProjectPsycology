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
		User user1 = new User("manel", "dhaouadi", "mm", "ll", "hh", new Date(), "hh", "mm", ERole.ROLE_MEDECIN);
		User user2 = new User("molka", "dhaouadi", "mm", "ll", "hh", new Date(), "hh", "mm",ERole.ROLE_STUDENT);
		User user3 = new User("youssef", "dhaouadi", "mm", "ll", "hh", new Date(), "hh", "mm",ERole.ROLE_STUDENT);


		// Création des instances de User
// Création des instances de Consultation
		Consultation consultation1 = new Consultation();
		Consultation consultation2 = new Consultation();
		Consultation consultation3 = new Consultation();


		//creation d'evenement
		Evennement evennement = new Evennement(new Date(), "description", "titre", user1);


// Ajout des Consultations à la liste de Consultations de chaque User
		user1.getConsultationsList().add(consultation1);
		user1.getConsultationsList().add(consultation2);
		user2.getConsultationsList().add(consultation1);
		user3.getConsultationsList().add(consultation3);



// Ajout des evene;ents à la liste de evenements de chaque User
		user1.getEvennements().add(evennement);


// Sauvegarde des Users et Consultations dans la base de données

		consultationRepository.save(consultation1);
		consultationRepository.save(consultation2);
		consultationRepository.save(consultation3);

		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);

// Sauvegarde de l'événement
		evenementRepository.save(evennement);

	}









}

