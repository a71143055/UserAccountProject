package kr.ac.kopo.jeong.useraccountproject.controller;

import kr.ac.kopo.jeong.useraccountproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Map<String, String> request) {
        try {
            userService.register(
                    request.get("username"),
                    request.get("password"),
                    request.get("email")
            );
            return ResponseEntity.ok("회원가입 성공!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("실패: " + e.getMessage());
        }
    }
}
