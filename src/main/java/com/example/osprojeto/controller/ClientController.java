package com.example.osprojeto.controller;

import com.example.osprojeto.Dtos.ClientDto;
import com.example.osprojeto.Repository.ClientRepository;
import com.example.osprojeto.Service.Servicess;
import com.example.osprojeto.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @Autowired
    private Servicess servicess;

    @GetMapping(path = "/client")
    public ResponseEntity<List<Client>> findAll(){
        ResponseEntity<List<Client>> response = null;
        List<Client> clients = repository.findAll();
        if(clients == null || clients.isEmpty() ){
            response =ResponseEntity.noContent().build();
        }else {
            response = ResponseEntity.ok(clients);
        }
        return response;
    }
    @PostMapping(path = "/client")
    public void salvar(@RequestBody ClientDto clientDto){
        repository.save(new Client(clientDto));
    }

    @GetMapping(path = "/client/{name}")
    public ResponseEntity<List<Client>>FindClientByName(@PathVariable(name = "name")String name){
        List<Client> client = repository.searchByName(name.trim());

        return new ResponseEntity<List<Client>>(client,HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping(path = "/client/{id}")
    public void excluir(@PathVariable Long id){
           repository.deleteById(id);
    }
    @Transactional
    @DeleteMapping("/client/{name}")
    public String DeleteByName(@PathVariable String name) {
        Servicess.DeleteByName(name);
        return "Cliente com nome " + name + " deletado com sucesso!";
    }


}
