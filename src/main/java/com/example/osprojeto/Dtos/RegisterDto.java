package com.example.osprojeto.Dtos;

import com.example.osprojeto.entity.UserRole;

public record RegisterDto(String email, String password, UserRole role) {
}
