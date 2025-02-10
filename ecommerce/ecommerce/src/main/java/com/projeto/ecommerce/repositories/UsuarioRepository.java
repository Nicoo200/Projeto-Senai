package com.projeto.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecommerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
