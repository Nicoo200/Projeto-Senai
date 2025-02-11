package com.projeto.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projeto.ecommerce.dto.ProdutoDTO;
import com.projeto.ecommerce.services.ProdutoService;


@RestController
@RequestMapping("api")
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	@GetMapping("/list")
	public List<ProdutoDTO> findAll() {
		return service.findall();
	}
	
	@GetMapping("/buscar")
		public Page<ProdutoDTO> findAll(Pageable pagina) {
			return service.findPagina(pagina); 
	}


}
