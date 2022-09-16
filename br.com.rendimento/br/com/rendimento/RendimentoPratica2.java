package br.com.rendimento;
import java.text.NumberFormat;

public class RendimentoPratica2 {
	private double invesInicial;
	private double taxaRendimento;
	private int numMeses;

	public RendimentoPratica2(double invesInicial, double taxaRendimento, int numMeses) {
		super();
		this.invesInicial = invesInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
		
	}
	public double getInvesInicial() {
		return invesInicial;
	}
	public void setInvesInicial(double invesInicial) {
		this.invesInicial = invesInicial;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	public int getNumMeses() {
		return numMeses;
	}
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public void calculaRendimento () {
		double invesFinal;
		invesFinal = getInvesInicial();
		System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(getInvesInicial()));
		System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
		for (int i=0; i < getNumMeses(); numMeses++) {
			
			invesFinal=invesFinal*getTaxaRendimento()/100+invesFinal;
			System.out.println("Mês " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(invesFinal));
		}
	}
}
