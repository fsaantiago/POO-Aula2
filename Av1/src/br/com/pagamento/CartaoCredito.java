package br.com.pagamento;

public class CartaoCredito extends Pagamento{
	String numeroCartao;
	String bandeiraCartao;
	String titularCartao;''
	
	public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numeroCartao,
			String bandeiraCartao, String titularCartao) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.numeroCartao = numeroCartao;
		this.bandeiraCartao = bandeiraCartao;
		this.titularCartao = titularCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}
	
	public void imprimirCupomFiscal(String numeroCartao, String bandeiraCartao,
	String titularCartao) {
		this.numeroCartao=getNumeroCartao();
		this.bandeiraCartao=getBandeiraCartao();
		this.titularCartao=getTitularCartao();		
	}
}
