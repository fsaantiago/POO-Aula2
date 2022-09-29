package br.com.ex02;
import java.util.Scanner;

public class FPadrao extends Funcionario {
	private double salarioFixo;

	public FPadrao(int matricula, String nome, double salario, double salarioFixo) {
		super(matricula, nome, salario);
		this.salarioFixo = salarioFixo;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	public void calculaProventos() {
		double salarioFixo;
		salarioFixo = getSalario();
		
	}

	
}
