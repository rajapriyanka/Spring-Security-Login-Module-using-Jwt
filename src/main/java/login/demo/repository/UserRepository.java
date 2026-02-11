package login.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import login.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

