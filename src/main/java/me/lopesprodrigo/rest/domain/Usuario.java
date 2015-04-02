package me.lopesprodrigo.rest.domain;

public class Usuario {
	
	public enum Sexo {
		MASCULINO, FEMININO;
	}
	
	private Long id;
	private String nome;
	private Sexo sexo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
	
}