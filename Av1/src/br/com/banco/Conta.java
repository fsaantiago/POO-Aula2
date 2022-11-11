package br.com.banco;

public class Conta extends Clientes {

    private int agencia;
    private int numConta;
    private double saldo;

    public Conta(String nomeCliente, String uf, String nome2, String endereco, String telefone, Cidades cidade,
			int agencia, int numConta, double saldo) {
		super(nomeCliente, uf, nome2, endereco, telefone, cidade);
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }

}