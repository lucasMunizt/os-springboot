package com.example.osprojeto.controller;

import com.example.osprojeto.Dtos.ClientDto;
import com.example.osprojeto.Repository.ClientRepository;
import com.example.osprojeto.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository repository;

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
    @GetMapping(path ="/clientes/{name]")
    public ResponseEntity<List<Client>>DeleteByName(@PathVariable(name = "name")String name){
        List<Client> client = repository.DeleteByName(name);

        return new ResponseEntity<List<Client>>(client,HttpStatus.OK);
    }


}
