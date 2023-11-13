package com.example.osprojeto.Repository;

import com.example.osprojeto.entity.Guarantee;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuaranteeRepository extends JpaRepository<Guarantee,Long> {
}
