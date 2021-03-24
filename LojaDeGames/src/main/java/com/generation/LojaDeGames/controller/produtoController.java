package com.generation.LojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.LojaDeGames.model.Produto;
import com.generation.LojaDeGames.repository.produtoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class produtoController {
	
	@Autowired
	private produtoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/preco/{preco}")
	public ResponseEntity<List<Produto>> GetByPreco(@PathVariable int preco){
		return ResponseEntity.ok(repositorio.findAllByPreco(preco));
	}
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repositorio.findAllByNomeContainingIgnoreCase(nome));
	}
	
	/* seila amigos
	@GetMapping("/precomaior50/{preco}")
	public ResponseEntity<List<Produto>> GetByDiferencaPreco(@PathVariable int preco){
		
		if (????) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(repositorio.findAllByPreco(preco));
		} 
	}
	*/
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositorio.deleteById(id);
	}
	
}

