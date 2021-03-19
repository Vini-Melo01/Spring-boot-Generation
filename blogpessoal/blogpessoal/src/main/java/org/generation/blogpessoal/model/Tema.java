package org.generation.blogpessoal.model;

import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)// um tema para muitas postagens
	@JsonIgnoreProperties("tema")
	private List<Postagem>postagem;
	
	//encapsulamentos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}


	

}
