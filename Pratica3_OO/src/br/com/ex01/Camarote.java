package br.com.ex01;

public class Camarote extends Ingresso {
	private double valorAdicionalCamarote;
	private String localizacao;
	
	public Camarote(double valorIngresso, double valorAdicionalCamarote, String localizacao) {
		super(valorIngresso);
		this.valorAdicionalCamarote = valorAdicionalCamarote;
		this.localizacao = localizacao;
	}

	public double getValorAdicionalCamarote() {
		return valorAdicionalCamarote;
	}

	public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
		this.valorAdicionalCamarote = valorAdicionalCamarote;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String imprimeIngresso(){
		return "Ingresso Camarote: " + (getvalorIngresso() + getValorAdicionalCamarote() + "\n" + getLocalizacao());
	}
	
}
