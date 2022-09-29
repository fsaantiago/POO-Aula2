package br.com.ex01;

public class IngressoNormal extends Ingresso {

	public IngressoNormal(double valorIngresso) {
		super(valorIngresso);
	}
	String imprimeIngresso() {
		return "Ingresso normal: " + getvalorIngresso();
	}
}
