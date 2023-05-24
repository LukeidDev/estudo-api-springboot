package ssp.dev.celularseguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ssp.dev.celularseguro.model.Celular;

public interface CelularRepository extends JpaRepository<Celular, Long>{
    
}
