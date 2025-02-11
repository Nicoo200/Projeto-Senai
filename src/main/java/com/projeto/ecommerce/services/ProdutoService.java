package com.projeto.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projeto.ecommerce.dto.ProdutoDTO;
import com.projeto.ecommerce.model.Produto;
import com.projeto.ecommerce.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repo;
	
	public List<ProdutoDTO> findall(){
		List<Produto> lista = repo.findAll();
		return lista.stream().map(x -> new ProdutoDTO(x)).toList();
	}
	
	public Page<ProdutoDTO> findPagina(Pageable pagina ){
		Page<Produto> busca = repo.findAll(pagina);
		return busca.map(x -> new ProdutoDTO(x));
	}

}
