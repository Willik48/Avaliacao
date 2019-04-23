package com.atividade.br.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tema implements Serializable {
	public static final long serialVersionID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String toalhaMesa;
	
	@ElementCollection
	@CollectionTable(name = "ITENS")
	private Set<String> itens = new HashSet<>();
	
	@OneToOne
	private Festinhainfantil festinha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getToalhaMesa() {
		return toalhaMesa;
	}

	public void setToalhaMesa(String toalhaMesa) {
		this.toalhaMesa = toalhaMesa;
	}

	public Set<String> getItens() {
		return itens;
	}

	public void setItens(Set<String> itens) {
		this.itens = itens;
	}

	public Tema(Integer id, String nome, String toalhaMesa, Set<String> itens) {
		this.id = id;
		this.nome = nome;
		this.toalhaMesa = toalhaMesa;
		this.itens = itens;
	}

	public Tema() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tema other = (Tema) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
