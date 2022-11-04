package br.com.funcionarios;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[10];
		Funcionario func;
		Empresa emp1;
		String nome,email,telefone,departamento,dataEntrada,RG, nomeEmp,CNPJ;
		Double salario;
		int qtdeFunc;
		boolean status=true;
		
		for (int i=0;i<2;i++) {

			nome=JOptionPane.showInputDialog("Nome");
			email=JOptionPane.showInputDialog("Email");
			telefone=JOptionPane.showInputDialog("Telefone");
			departamento=JOptionPane.showInputDialog("Departamento");
			dataEntrada=JOptionPane.showInputDialog("dataEntrada");
			RG=JOptionPane.showInputDialog("RG");
			salario=Double.parseDouble(JOptionPane.showInputDialog("Salario"));
			
			func = new Funcionario(nome,email,telefone,departamento,salario,dataEntrada,RG,status);
			funcionarios[i] = func;
		
			
		}
		nomeEmp=JOptionPane.showInputDialog("Nome da empresa: ");
		CNPJ=JOptionPane.showInputDialog("CNPJ: ");
		qtdeFunc= Integer.parseInt( JOptionPane.showInputDialog("Quantidade de funcionarios: "));
		emp1 = new Empresa(nomeEmp, CNPJ, qtdeFunc);
		for(Funcionario func1:funcionarios) {
			emp1.insereFuncionario(func1);
		}
		
	}

}
