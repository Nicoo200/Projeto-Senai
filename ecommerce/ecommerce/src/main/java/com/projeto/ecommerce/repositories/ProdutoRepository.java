package com.projeto.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
