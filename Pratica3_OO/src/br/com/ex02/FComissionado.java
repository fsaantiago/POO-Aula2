package br.com.ex02;
import java.text.NumberFormat;

public class FComissionado extends Funcionario {
	private double comissionado;
	private double percentual;
	private double vendas;
	
	public FComissionado(int matricula, String nome, double salario, double comissionado, double percentual,
			double vendas) {
		super(matricula, nome, salario);
		this.comissionado = comissionado;
		this.percentual = percentual;
		this.vendas = vendas;
	}

	public double getComissionado() {
		return comissionado;
	}

	public void setComissionado(double comissionado) {
		this.comissionado = comissionado;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	public void calculaProventos() {
		double comissionado =  getSalario();
		System.out.println("Valor do Salario:" + NumberFormat.getCurrencyInstance().format(getSalario()));
		System.out.println("Quantidade de vendas: " + NumberFormat.getCurrencyInstance().format(getVendas()));
		System.out.println("Percentual de venda: " + NumberFormat.getPercentInstance().format(getPercentual()/100));
		comissionado = getSalario()+(getVendas()*getPercentual());
		
	}
	
	/*
	System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(getInvesInicial()));
	System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
	for (int i=0; i < getNumMeses(); numMeses++) {
		
		invesFinal=invesFinal*getTaxaRendimento()/100+invesFinal;
		System.out.println("Mês " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(invesFinal));*/

}
