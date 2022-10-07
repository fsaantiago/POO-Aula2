package br.com.projeto;

public class DistribuicaoAlimento extends Projeto {
	String descAlimento;
	float qtde;
	
	public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim, String descAlimento, float qtde) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.descAlimento = descAlimento;
		this.qtde = qtde;
	}

	public String getDescAlimento() {
		return descAlimento;
	}

	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}

	public float getQtde() {
		return qtde;
	}

	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	
	public void imprimeProjeto(String descAlimento, float qtde) {
		this.descAlimento=getDescAlimento();
		this.qtde=getQtde();
	}
	
	
}
