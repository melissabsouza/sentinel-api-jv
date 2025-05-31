package br.com.fiap.sentinel_api.repository;

import br.com.fiap.sentinel_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
