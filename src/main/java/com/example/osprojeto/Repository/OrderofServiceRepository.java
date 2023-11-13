package com.example.osprojeto.Repository;

import com.example.osprojeto.entity.OrderofService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderofServiceRepository extends JpaRepository<OrderofService, Long> {

}
