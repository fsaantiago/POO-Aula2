package br.com.banco.exemplo;

public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(String numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double consultaSaldoTotal() {
		return this.limite + getSaldo();
	}
}
