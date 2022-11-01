package br.com.exemplovetor1;

public class exemplo1 {
	private String nome;
	private int matricula;
	
	public exemplo1(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String mostrar() {
		return getNome() + "" + getMatricula();
	}
}
