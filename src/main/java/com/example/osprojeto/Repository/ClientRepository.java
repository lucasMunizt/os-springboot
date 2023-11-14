package com.example.osprojeto.Repository;

import com.example.osprojeto.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    @Query(value = "select c from Client c where trim(c.name) like %?1%")
    List<Client> searchByName(String name);


    void deleteByName(String name);

}
