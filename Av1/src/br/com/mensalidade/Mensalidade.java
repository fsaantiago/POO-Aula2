package br.com.mensalidade;


public class Mensalidade {
	
		double valorMensalidade;
		int numeroIrmaos;
		double desconto;				
		
		public void calculaMensalidade(double valorMensalidade, double desconto) {
			this.valorMensalidade=valorMensalidade*(desconto);
		}	
}
