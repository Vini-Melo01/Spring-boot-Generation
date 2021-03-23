package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
			
	@NotNull
	@Size(min = 3, max = 20)
	private String beleza;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String fitness;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String higiene;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String medicamentos;
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@OneToMany(mappedBy ="categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("Categoria")
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}

	public String getBeleza() {
		return beleza;
	}

	public void setBeleza(String beleza) {
		this.beleza = beleza;
	}

	public String getFitness() {
		return fitness;
	}

	public void setFitness(String fitness) {
		this.fitness = fitness;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	@NotNull
	@Size(min = 3, max = 20)
	private String saude;
	

}
