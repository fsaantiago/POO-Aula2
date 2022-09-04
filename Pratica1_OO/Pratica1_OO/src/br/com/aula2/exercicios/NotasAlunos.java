package br.com.aula2.exercicios;
import java.util.Scanner;

public class NotasAlunos {
	static int notaAV1;
	static int notaAV2;
	static int notaAVE;
	
	public static void main (String [] args) {
		
		Scanner nota = new Scanner(System.in);
			System.out.println("Digite o valor da Avaliacao 1: ");
			notaAV1 = nota.nextInt();
			
			System.out.println("Digite o valor da Avaliacao 2: ");
			notaAV2 = nota.nextInt();
			
	}
	
	public void Soma (int soma) {
		soma = notaAV1 + notaAV2;
		if (soma < 60) {
			System.out.println("Sua nota está abaixo do valor mínimo. Precisara fazer a avaliacao especial");
		} 
	}

}
