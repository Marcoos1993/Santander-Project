package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santander_dev_week_2024.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
