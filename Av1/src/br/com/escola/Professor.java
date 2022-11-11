package br.com.escola;

public class Professor extends Pessoa {
	private float salarioHora;
	private int horasAula;
	private float salario;	
	
	public Professor(String nome, String email, String senha, float salarioHora, int horasAula, float salario) {
		super(nome, email, senha);
		this.salarioHora = salarioHora;
		this.horasAula = horasAula;
		this.salario = salario;
	}

	public float getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(float salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getHorasAula() {
		return horasAula;
	}

	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void calculaSalario() {
		this.salario = this.salarioHora * this.horasAula;
	}
	
	public void mostraProfessor(String nome, String email, String senha, float salarioHora, int horasAula) {
		System.out.println("Nome do professor: "+nome+"\nE-mail: "+email+"\nSenha: "+senha+"\nSalario Hora: "+salarioHora+"\nHoras aula: "+horasAula);
	}
}
