package br.com.pagamento;

public class Pix extends Pagamento {
	String comprovanteTransacaoPx;

	public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, String comprovanteTransacaoPx) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.comprovanteTransacaoPx = comprovanteTransacaoPx;
	}

	public String getComprovanteTransacaoPx() {
		return comprovanteTransacaoPx;
	}

	public void setComprovanteTransacaoPx(String comprovanteTransacaoPx) {
		this.comprovanteTransacaoPx = comprovanteTransacaoPx;
	}
	
	public void imprimirCupomFiscal(String comprovanteTransacaoPix) {
		if (comprovanteTransacaoPix!= null)
			System.out.println("O pagamento foi feito com Pix!");
	}
	
}
