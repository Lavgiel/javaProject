package ru.sfedu.muam_proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sfedu.muam_proj.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
