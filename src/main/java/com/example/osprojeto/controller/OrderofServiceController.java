package com.example.osprojeto.controller;

import com.example.osprojeto.Dtos.OrderofServiceDto;
import com.example.osprojeto.Repository.OrderofServiceRepository;
import com.example.osprojeto.Service.Servicess;
import com.example.osprojeto.entity.OrderofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderofServiceController {
    @Autowired
    private OrderofServiceRepository repository;

    @Autowired
    private Servicess servicess;
    @GetMapping(path = "/servicos")
    public ResponseEntity<List<OrderofService>> findAll(){
        ResponseEntity<List<OrderofService>> response = null;
        List<OrderofService> orderofServices = repository.findAll();
        if(orderofServices == null || orderofServices.isEmpty() ){
            response = ResponseEntity.noContent().build();
        }else {
            response = ResponseEntity.ok(orderofServices);
        }
        return response;
    }

    @PostMapping(path = "/servicos")
    public void salvar(@RequestBody OrderofServiceDto orderofServiceDto){
        repository.save(new OrderofService(orderofServiceDto));
    }

    @PutMapping(path = "/servicos/{id}")
    public OrderofService FindAlterById(@RequestBody OrderofServiceDto orderofServiceDto){
        return repository.save(new OrderofService(orderofServiceDto));
    }



    @GetMapping(path = "/servicos/{id}")
    public Optional<OrderofService> FindServicesById(@PathVariable(name = "id")Long id){
        Optional<OrderofService> orderofService = repository.findById(id);
        return orderofService;
    }

    @DeleteMapping(path = "/servicos/{id}")
    public void deleteById(@PathVariable long id){
        servicess.deleteByid(id);
    }

}
