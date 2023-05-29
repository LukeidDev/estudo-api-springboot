package ssp.dev.celularseguro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ssp.dev.celularseguro.model.Celular;

public interface CelularRepository extends JpaRepository<Celular, Long>{
    
    @Query(value = "select c from Celular c where upper(trim(c.modelo)) like %?1%")
    List<Celular> buscarPorModelo(String modelo);
}
