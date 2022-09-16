package br.com.rendimento;
import java.util.Scanner;

public class MainRendimentoPratica2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero do investimento inicial: ");
		double invesInicial = ler.nextDouble();
		System.out.println("Digite o valor da taxa de rendimento: ");
		double taxaRendimento = ler.nextDouble();
		System.out.println("Digite por quantos meses deseja investir: ");
		int numMeses = ler.nextInt();
		
		RendimentoPratica2 r1 = new RendimentoPratica2(invesInicial, taxaRendimento, numMeses);
		r1.calculaRendimento();
	}
}
