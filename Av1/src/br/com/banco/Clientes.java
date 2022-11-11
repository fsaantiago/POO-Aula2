package br.com.banco;

public class Clientes extends Cidades {
	private String nomeCliente, endereco, telefone;

	
	public Clientes(String nomeCliente, String uf, String nome2, String endereco, String telefone, Cidades cidade) {
		super(nomeCliente, uf);
		nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cidade = cidade;
	}

	Cidades cidade = new Cidades(getNomeCidade(), getUf());

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
