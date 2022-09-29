package br.com.ex01;

public class IngressoVip extends IngressoNormal {

	private double valorAdicional;

	public IngressoVip(double valorIngresso, double valorAdicional) {
		super(valorIngresso);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public String imprimeIngresso(){
		return "Ingresso Vip: " + (getvalorIngresso() + getValorAdicional());
	}
	
	
}
