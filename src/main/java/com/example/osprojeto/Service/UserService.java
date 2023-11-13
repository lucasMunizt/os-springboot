//package com.example.osprojeto.Service;
//
//import com.example.osprojeto.Dtos.UsersDto;
//import com.example.osprojeto.Repository.UserRepository;
//import com.example.osprojeto.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public boolean ValidadEmail(User user){
//        boolean result = false;
//        try {
//            if(!user.getEmail() == null){
//                result = false;
//            }else {
//                result = true;
//            }
//        }catch (Exception e){
//            return result;
//        }
//        return result;
//    }
//
//
//
//
//
//}
