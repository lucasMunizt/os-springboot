package com.example.osprojeto.Service;
import com.example.osprojeto.Repository.ClientRepository;
import com.example.osprojeto.Repository.GuaranteeRepository;
import com.example.osprojeto.Repository.OrderofServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicess {

    @Autowired
    private OrderofServiceRepository orderRepository;

    @Autowired
    private static ClientRepository clientRepository;

    @Autowired
    public Servicess(ClientRepository clienteRepository) {
        this.clientRepository = clienteRepository;
    }

    @Autowired
    private GuaranteeRepository guaranteeRepository;

    //ordem de serviço
    public void deleteByid(Long id){
        orderRepository.deleteById(id);

    }

    //Cliente

    public static void DeleteByName(String name) {
        clientRepository.deleteByName(name);
    }


    //garantia
    public void deletar(Long id){
        guaranteeRepository.deleteById(id);
    }

}
