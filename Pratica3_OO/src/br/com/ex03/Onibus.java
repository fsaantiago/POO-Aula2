package br.com.ex03;

public class Onibus extends Veiculo {

	private int assentos;

	public Onibus(String placa, Object object, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		System.out.printf("Dados do veiculo: ", "\nPlaca: " + getPlaca(), "\nAno do veiculo: " + getAno(), "\nAssentos: " + getAssentos()); 
	}

}
