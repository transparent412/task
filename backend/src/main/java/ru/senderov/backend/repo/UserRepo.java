package ru.senderov.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.senderov.backend.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
