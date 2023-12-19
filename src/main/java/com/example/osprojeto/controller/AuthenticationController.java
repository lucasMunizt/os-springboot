package com.example.osprojeto.controller;

import com.example.osprojeto.Dtos.LoginDto;
import com.example.osprojeto.Dtos.RegisterDto;
import com.example.osprojeto.Dtos.UsersDto;
import com.example.osprojeto.Repository.UserRepository;
import com.example.osprojeto.entity.User;
import com.example.osprojeto.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository repository;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity Login(@RequestBody @Validated UsersDto usersDto){
        var usernamePassword = new UsernamePasswordAuthenticationToken(usersDto.email(), usersDto.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.GenereteToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginDto(token));
    }

    @PostMapping("/register")
    public ResponseEntity Register(@RequestBody @Validated RegisterDto registerDto){
        if(this.repository.findByEmail(registerDto.email())!=null) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());
        User newUser = new User(registerDto.email(),encryptedPassword,registerDto.role());

        this.repository.save(newUser);

        return ResponseEntity.ok().build();

    }



}
