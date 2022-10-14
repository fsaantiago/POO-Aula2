package br.com.contaabstract;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		
	}
	
	public void sacar(double valor) {
		
	}
	
	public abstract void  imprimeExtrato(); //sem conteudo - lembrar na aula
}
