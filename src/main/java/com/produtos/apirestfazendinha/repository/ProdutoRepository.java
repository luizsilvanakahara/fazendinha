package com.produtos.apirestfazendinha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirestfazendinha.models.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos,Long>{
	Produtos findById(long id);

}
