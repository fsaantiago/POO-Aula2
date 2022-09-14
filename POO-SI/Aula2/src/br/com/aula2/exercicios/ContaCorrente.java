package br.com.aula2.exercicios;

public class ContaCorrente {

		private long numero;
		private int agencia;
		private double saldo;
		
		ContaCorrente(long num, int ag) {
			numero=num;
			agencia=ag;
			saldo=0;
		}
		
		public void Depositar(double valor) {
			saldo = saldo + valor;
		}
		
		public void Sacar(double valor) {
			//saldo = saldo - valor;
			if (valor <= saldo) 
				saldo = saldo - valor;
			else
				System.out.println("Saldo insuficiente para sacar.");
			
		}
		
		public double ConsultaSaldo() {
			return saldo;
		}
		
		
		
}
