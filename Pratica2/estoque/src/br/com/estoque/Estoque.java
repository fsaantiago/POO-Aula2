package br.com.estoque;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public void darBaixa (int qtde) {
		if (qtde <= qtdAtual)
			this.qtdAtual -= qtde;
		else
			System.out.println("Operação não disponível! \nO valor ultrapassa o limite.");
			
	}
	
	public String Mostra() {
		return "Produto" + getNome()+ "\nEstoque atual " + getQtdAtual() + "\nEstoque mínimo" + getQtdMinima();
	}
	
	public boolean precisaRepor() {
		if (this.qtdAtual <= this.qtdMinima)
			return true;
		else
			return false;
	}
	
	public Estoque () {
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome; 
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
		
		/* this = operador que referencia os atributos da própria classe */
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	
}
	