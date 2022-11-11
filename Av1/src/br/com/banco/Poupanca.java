package br.com.banco;

public class Poupanca extends Conta {
    private int tipoConta;

	public Poupanca(String nomeCliente, String uf, String nome2, String endereco, String telefone, Cidades cidade,
			int agencia, int numConta, double saldo, int tipoConta) {
		super(nomeCliente, uf, nome2, endereco, telefone, cidade, agencia, numConta, saldo);
		this.tipoConta = tipoConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
    


}