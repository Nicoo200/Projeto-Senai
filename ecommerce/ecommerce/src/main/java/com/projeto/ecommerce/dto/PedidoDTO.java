package com.projeto.ecommerce.dto;

import java.time.Instant;

import com.projeto.ecommerce.model.StatusDoPedido;

public record PedidoDTO(Instant momento, StatusDoPedido status) {

}
