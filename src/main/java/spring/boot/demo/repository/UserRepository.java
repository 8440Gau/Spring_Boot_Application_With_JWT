package spring.boot.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.boot.demo.entity.User_Info;

@Repository
public interface UserRepository extends JpaRepository<User_Info , Long> {

	 Optional<User_Info> findByUsername(String username);
}