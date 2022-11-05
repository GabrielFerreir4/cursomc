package com.smoly.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	/*implements Serializable  e private static final long serialVersionUID = 1L;
	quer dizer que os objetos dessa
	classe podem ser convertidos em bytes, para que os
	objetos possam ser gravados em arquivos,trafegar em rede..*/
	private Integer id;
	private String name;
	public Categoria() {
	}
	public Categoria(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//para comparar objetos pelo conteudo
	//gerei o hashCode e o Equals 
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}
	
	
	
}
