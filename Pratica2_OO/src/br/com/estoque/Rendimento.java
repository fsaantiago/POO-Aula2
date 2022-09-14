package br.com.estoque;

public class Rendimento {
	private double invesInicial;
	private double taxaRendimento;
	private int numMeses;

	public Rendimento(double invesInicial, double taxaRendimento, int numMeses) {
		super();
		this.invesInicial = invesInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}
	public double getInvesInicial() {
		return invesInicial;
	}
	public void setInvesInicial(Double invesInicial) {
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
}
