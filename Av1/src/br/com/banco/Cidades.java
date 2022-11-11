package br.com.banco;

public class Cidades {
	protected String nomeCidade;
	private String uf;

	public Cidades(String nome, String uf) {
		super();
		this.nomeCidade = nomeCidade;
		this.uf = uf;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNome(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}

