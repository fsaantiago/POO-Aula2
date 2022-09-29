package br.com.ex03;

public class Caminhao extends Veiculo {

	private int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		System.out.printf("Dados do veiculo: ", "\nPlaca: " + getPlaca(), "\nAno do veiculo: " + getAno());
		System.out.printf("Dados do veiculo: " + getEixos()); 
		
	}
}
