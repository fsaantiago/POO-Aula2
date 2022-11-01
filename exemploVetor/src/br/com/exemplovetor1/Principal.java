package br.com.exemplovetor1;
import java.util.Scanner;

public class Principal {
	
	public static void main (String [] args) {
		String nome;
		int matricula;
		String buscar;
		
		Aluno[] alunos = new Aluno[10];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite matricula: ");
			matricula=ler.nextInt();
			System.out.println("Digite nome: ");
			nome=ler.nextLine();
			nome=ler.nextLine();
			
			alunos[i] = new Aluno(nome, matricula);
			System.out.println(alunos[i].mostrar());
						
		}
		
		System.out.println("Digite um nome para buscar");
		buscar=ler.nextLine();
		
		for (int i = 0; i < 2; i++) {
			if (alunos[i].getNome().equals(buscar))
				System.out.println("Nome encontrado com sucesso.");			
		}
	}
}
