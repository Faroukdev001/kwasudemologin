package com.faroukdev.kwasudemologin.Repo;

import com.faroukdev.kwasudemologin.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    boolean existsByEmail(String email);

    // boolean existsById(String program);

    Student findByEmail(String email);

    Optional<Student> findOneByEmailAndPassword(String email, String encodedPassword);
}
