package kr.ac.kopo.jeong.useraccountproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<User> extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
