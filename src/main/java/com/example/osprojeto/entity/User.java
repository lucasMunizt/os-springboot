package com.example.osprojeto.entity;

import com.example.osprojeto.Dtos.UsersDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public User(UsersDto usersDto){
        this.id = usersDto.id();
        this.email = usersDto.email();
        this.password = usersDto.password();
    }

}
