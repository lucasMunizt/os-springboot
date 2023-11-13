package com.example.osprojeto.Service;

import com.example.osprojeto.Repository.ClientRepository;
import com.example.osprojeto.Repository.OrderofServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicess {

    @Autowired
    private OrderofServiceRepository repository;


    @Autowired
    private ClientRepository clientRepository;
    public void deleteByid(Long id){
        repository.deleteById(id);
    }




}
