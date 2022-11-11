package br.com.escola;

public class Aluno extends Pessoa {
	private int periodo, turma;

	public Aluno(String nome, String email, String senha, int periodo, int turma) {
		super(nome, email, senha);
		this.periodo = periodo;
		this.turma = turma;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}
	
	public void mostraAluno(String nome, String email, String senha, int periodo, int turma) {
		System.out.println("Nome do aluno: "+nome+"\nE-mail: "+email+"\nSenha: "+senha+"\nSalario Hora: "+periodo+"\nHoras aula: "+turma);
	}
	
}
