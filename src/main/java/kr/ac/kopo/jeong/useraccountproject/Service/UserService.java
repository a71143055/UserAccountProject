package kr.ac.kopo.jeong.useraccountproject.Service;

import kr.ac.kopo.jeong.useraccountproject.entity.User;
import kr.ac.kopo.jeong.useraccountproject.repository.InMemoryUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final InMemoryUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(String username, String rawPassword, String email) {
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(rawPassword));
        user.setEmail(email);
        userRepository.save(user);
    }
}

