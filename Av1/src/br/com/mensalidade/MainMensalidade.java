package br.com.mensalidade;
import java.util.Scanner;

public class MainMensalidade {

	public static void main(String[] args) {
		
		double valorMensalidade = 0;
		int numeroIrmaos;
		double desconto;
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o valor do numero de irmaos: ");
		numeroIrmaos = ler.nextInt();
		
		Mensalidade M1 = new Mensalidade();
		
			if (numeroIrmaos==1) {
				desconto=5/100;
				System.out.println("O valor do desconto e: " + valorMensalidade*desconto);
				
			} else if (numeroIrmaos==2) {
				desconto=10/100;
				System.out.println("O valor do desconto e: " + valorMensalidade*desconto);
			} else if (numeroIrmaos>=3) {
				desconto=10/100;
				System.out.println("O valor do desconto e: " + valorMensalidade*desconto);
			} else {
				System.out.println("A mensalidade nao tera desconto!");
			}		
	}
}
