package com.atividade.br.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {
	public static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telCliente;
	
	@OneToMany(mappedBy = "cliente")
	private List<Festinhainfantil> festinhas = new ArrayList<Festinhainfantil>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	public List<Festinhainfantil> getFestinhas() {
		return festinhas;
	}

	public void setFestinhas(List<Festinhainfantil> festinhas) {
		this.festinhas = festinhas;
	}

	public Cliente(Integer id, String nome, String telCliente, List<Festinhainfantil> festinhas) {
		
		this.id = id;
		this.nome = nome;
		this.telCliente = telCliente;
		this.festinhas = festinhas;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Cliente() {
		
	}

	
	
}