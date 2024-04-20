package com.ProjectPsycology.ProjectPsycology.Repository;

import com.ProjectPsycology.ProjectPsycology.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
