package com.projeto.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecommerce.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
