package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Categoria;

public interface categoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByBelezaContainingIgnoreCase(String beleza);
	
}
