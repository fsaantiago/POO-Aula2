package br.com.contaabstract;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	private double saldoPoupanca;
	
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
	Date date = new Date();
	
	System.out.println("Saldo: " + this.getsaldo());
	System.out.println("Saldo: " + sdf.format(date));
	
}
