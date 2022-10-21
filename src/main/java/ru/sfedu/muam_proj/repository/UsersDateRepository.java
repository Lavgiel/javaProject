package ru.sfedu.muam_proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sfedu.muam_proj.model.UsersDate;

public interface UsersDateRepository extends JpaRepository<UsersDate, Long> {
}
