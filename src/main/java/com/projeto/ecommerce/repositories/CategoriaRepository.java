package com.projeto.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
