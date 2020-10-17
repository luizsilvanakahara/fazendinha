package com.produtos.apirestfazendinha.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirestfazendinha.models.Produtos;
import com.produtos.apirestfazendinha.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	@GetMapping("/produtos")
	public List<Produtos> listaProdutos(){
		return produtoRepository.findAll();
		
	}
	
	@GetMapping("/produto/{id}")
	public Produtos listaProdutos(@PathVariable (value="id")long  id){
		return produtoRepository.findById(id);
		
	}

	@PostMapping("/produto/{id}")
	public Produtos salvaProdutos(@RequestBody Produtos produto){
		return produtoRepository.save(produto);
		
	}
	@DeleteMapping("/produto/{id}")
	public void deletaProdutos(@RequestBody Produtos produto){
	 produtoRepository.delete(produto);
		
	}
	@PutMapping("/produto/{id}")
	public Produtos alteraProdutos(@RequestBody Produtos produto){
	 return produtoRepository.save(produto);
		
	}
}
