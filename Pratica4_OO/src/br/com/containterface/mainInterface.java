package br.com.containterface;

public class mainInterface {
	
	double depositar;
	double sacar;
	ContaCorrente cc = new ContaCorrente();
	cc.depositar(1200.200);
	cc.sacar(300);
	
	ContaPoupanca cp = new ContaPoupanca();
	cp.depositar(500.50);
	cp.sacar(25);
	
	GeradorExtratos gerador = new GeradorExtratos();
	gerador.geradorConta(cc);
	gerador.geradorConta(cp);
}
