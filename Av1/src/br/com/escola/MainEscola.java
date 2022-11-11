package br.com.escola;

public class MainEscola {
	public static void main (String [] args) {
		
		Professor professor = new  Professor("Michelle", "michelle@newton.br", "123456", 400, 4, 70000);
		Aluno aluno = new Aluno("Fernando", "fernando@newton.br", "123456",  6, 501);
		
		System.out.println("Professor: " + professor);
		System.out.println("Aluno: " + aluno);
	} 
}
