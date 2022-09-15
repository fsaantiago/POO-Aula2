package br.com.estoque;
import java.util.Scanner;

public class MainRendimento {

	public static void main(String[] args) {
		
		double invesInicial;
		double taxaRendimento;
		int numMeses = 0;
		double invesFinal;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero do investimento inicial: ");
		invesInicial = ler.nextDouble();
		System.out.println("Digite o valor de taxa de rendimento: ");
		taxaRendimento = ler.nextDouble();
		System.out.println("Digite o numero de meses para o rendimento: ");
		numMeses = ler.nextInt();
		invesFinal = invesInicial;
		
		Rendimento r1 = new Rendimento(invesInicial, taxaRendimento, numMeses);
		while (numMeses < 12) {
			invesFinal = invesFinal * taxaRendimento;
			numMeses++;
			System.out.println("Estes são os valores do investimento após o período de 12 meses: \n" + invesFinal);			
		}
	}
}
