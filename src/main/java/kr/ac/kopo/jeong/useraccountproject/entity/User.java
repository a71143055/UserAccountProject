package kr.ac.kopo.jeong.useraccountproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
}