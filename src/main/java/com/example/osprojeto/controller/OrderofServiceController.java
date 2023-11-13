//package com.example.osprojeto.controller;
//
//import com.example.osprojeto.entity.OrderofService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class OrderofServiceController {
//    @Autowired
//    private OrderofServiceController repository;
//
////    @GetMapping(path = "/servicos")
////    public ResponseEntity<List<OrderofService>> findAll(){
////        ResponseEntity<List<OrderofService>> response = null;
////        List<OrderofService> orderofServices = repository.findAll();
////        if(orderofServices == null || orderofServices.isEmpty() ){
////            response = ResponseEntity.noContent().build();
////        }else {
////            response = ResponseEntity.ok(orderofServices);
////        }
////        return response;
////    }
//}
