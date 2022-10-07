package br.com.projeto;

public class TrabalhoVoluntario extends Projeto {
	String tipoTrabalho;
	int duracaoTrabalho;
	
	public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
			String tipoTrabalho, int duracaoTrabalho) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}

	public String getTipoTrabalho() {
		return tipoTrabalho;
	}

	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}

	public void setDuracaoTrabalho(int duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}
	
	public void imprimeProjeto(String tipoTrabalho, int duracaoTrabalho) {
		this.tipoTrabalho=getTipoTrabalho();
		this.duracaoTrabalho=getDuracaoTrabalho();
		
	}
}
