package com.example.osprojeto.Service;
import com.example.osprojeto.Repository.ClientRepository;
import com.example.osprojeto.Repository.GuaranteeRepository;
import com.example.osprojeto.Repository.OrderofServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicess {

    @Autowired
    private OrderofServiceRepository orderRepository;

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private GuaranteeRepository guaranteeRepository;

    //ordem de serviço
    public void deleteByid(Long id){
        orderRepository.deleteById(id);

    }

    //Cliente
    public void excluir(Long id){
        clientRepository.deleteById(id);
    }

    //garantia
    public void deletar(Long id){
        guaranteeRepository.deleteById(id);
    }

}
