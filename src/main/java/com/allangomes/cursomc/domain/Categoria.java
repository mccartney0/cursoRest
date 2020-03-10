package com.allangomes.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //Já cria o banco automaticamente
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //definindo ID como Chave primária
	private Integer id;
	private String nome;
	private String nascimento;
	private String foto;
	private String assinatura;
	private String user_name;
	private String password;
	public Categoria() {
	}

	public Categoria(Integer id, String nome, String nascimento, String foto, String assinatura, String user_name,
			String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.assinatura = assinatura;
		this.user_name = user_name;
		this.password = password;
	}

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



	public String getNascimento() {
		return nascimento;
	}



	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	public String getAssinatura() {
		return assinatura;
	}



	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
