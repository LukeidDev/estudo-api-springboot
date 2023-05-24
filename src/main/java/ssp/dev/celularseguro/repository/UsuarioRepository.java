package ssp.dev.celularseguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ssp.dev.celularseguro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
