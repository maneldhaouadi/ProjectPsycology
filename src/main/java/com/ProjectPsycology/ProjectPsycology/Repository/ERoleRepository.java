package com.ProjectPsycology.ProjectPsycology.Repository;

import com.ProjectPsycology.ProjectPsycology.Models.ERole;
import com.ProjectPsycology.ProjectPsycology.Models.User;
import org.hibernate.event.spi.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import static org.hibernate.event.spi.EventType.values;

public interface ERoleRepository extends JpaRepository<User,Integer> {
    Optional<User> findById(Integer id);

    ERole save(ERole eRole);

}
