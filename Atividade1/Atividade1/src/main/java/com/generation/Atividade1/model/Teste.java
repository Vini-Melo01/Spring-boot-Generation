package com.generation.Atividade1.model;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity 
@Table(name = "teste") // transformar em tabela (estilo sql)
public class Teste {
	
	@Id // Transforma em primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Gera um valor pro id 
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo= titulo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto=texto;
	}
	
}
