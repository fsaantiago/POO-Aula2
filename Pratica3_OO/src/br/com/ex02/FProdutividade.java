package br.com.ex02;
import java.text.NumberFormat;

public class FProdutividade extends Funcionario{

	private double produtividade;
	private double valor;
	private int producao;	
		
		public FProdutividade(int matricula, String nome, double salario, double produtividade, double valor,
				int producao) {
			super(matricula, nome, salario);
			this.produtividade = produtividade;
			this.valor = valor;
			this.producao = producao;
		}
		
		public double getProdutividade() {
			return produtividade;
		}
		public void setProdutividade(double produtividade) {
			this.produtividade = produtividade;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public int getProducao() {
			return producao;
		}
		public void setProducao(int producao) {
			this.producao = producao;
		}
		
		public void calculaProventos() {
			double produtividade = getSalario();
			System.out.println("Valor do Salario: " + NumberFormat.getCurrencyInstance().format(getSalario()));
			System.out.println("Valor da meta: " + NumberFormat.getCurrencyInstance().format(getValor()));
			System.out.println("Valor da producao: " + NumberFormat.getCurrencyInstance().format(getProducao()));
			produtividade = getSalario()+(getValor()+getProducao());
		}
}
