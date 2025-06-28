package kr.ac.kopo.jeong.useraccountproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
}
