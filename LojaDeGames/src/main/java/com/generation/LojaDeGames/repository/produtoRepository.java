package com.generation.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaDeGames.model.Produto;

public interface produtoRepository extends JpaRepository<Produto, Long>{
	public List<Produto>findAllByPreco(int preco);
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);

}
