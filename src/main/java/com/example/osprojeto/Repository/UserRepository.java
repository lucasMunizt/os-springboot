package com.example.osprojeto.Repository;

import com.example.osprojeto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
