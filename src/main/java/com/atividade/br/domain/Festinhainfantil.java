package com.atividade.br.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Festinhainfantil implements Serializable{
	public static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telCliente;
	private String endFesta;
	private String dataFesta;
	private String hInicio;
	private String hFim;
	
	@OneToOne
	@JoinColumn(name = "id_tema")
	private Tema tema;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

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

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	public String getEndFesta() {
		return endFesta;
	}

	public void setEndFesta(String endFesta) {
		this.endFesta = endFesta;
	}

	public String getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}

	public String gethInicio() {
		return hInicio;
	}

	public void sethInicio(String hInicio) {
		this.hInicio = hInicio;
	}

	public String gethFim() {
		return hFim;
	}

	public void sethFim(String hFim) {
		this.hFim = hFim;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}

	public Festinhainfantil(Integer id, String nome, String telCliente, String endFesta, String dataFesta, String hInicio,
			String hFim, Tema tema, Cliente cliente) {

		this.id = id;
		this.nome = nome;
		this.telCliente = telCliente;
		this.endFesta = endFesta;
		this.dataFesta = dataFesta;
		this.hInicio = hInicio;
		this.hFim = hFim;
		this.tema = tema;
		this.cliente = cliente;
	}

	public Festinhainfantil() {
	
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
		Festinhainfantil other = (Festinhainfantil) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
