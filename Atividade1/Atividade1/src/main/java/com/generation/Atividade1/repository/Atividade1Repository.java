package com.generation.Atividade1.repository;

import com.generation.Atividade1.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface Atividade1Repository extends JpaRepository <Teste, Long> {
	public List<Teste> findAllByTituloContainingIgnoreCase (String titulo);
	

}
