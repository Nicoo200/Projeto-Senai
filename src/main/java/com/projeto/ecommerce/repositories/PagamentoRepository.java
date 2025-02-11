package com.projeto.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecommerce.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
