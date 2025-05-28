package com.devsuperior.course_jpa.repositories;
import com.devsuperior.course_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
