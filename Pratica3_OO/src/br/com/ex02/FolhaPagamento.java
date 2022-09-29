package br.com.ex02;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class FolhaPagamento {
	
	
	public FolhaPagamento(int matricula, double nome) {
		
	}

	public static void main (String [] args) {
		double salario;
		double valorProventos;
		int opcao;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a matricula do funcionario: " );
		int matricula = ler.nextInt();
		System.out.println("Digite o nome do funcionario: ");
		double nome = ler.nextDouble();
		
		FolhaPagamento f1 = new FolhaPagamento(matricula, nome);
		
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog("Selecione o calculo do provento que deseja:\n<1>Salario Fixo\n<2>Comissao\n<3>Produtividade\n<4>Sair"));
			switch (opcao)
			{			
			case 1:
				
				salario=Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
				valorProventos=Double.parseDouble(JOptionPane.showInputDialog("Tipo do provento: "));
				FPadrao salarioFixo = new FPadrao(matricula, null, salario, valorProventos);
				JOptionPane.showMessageDialog(null, salarioFixo.calculaProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);		
				break;
			
			case 2:
				
				salario=Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
				valorProventos=Double.parseDouble(JOptionPane.showInputDialog("Tipo do provento: "));
				FComissionado fcComissionado = new FComissionado(matricula, null, salario, valorProventos, nome, nome);
				JOptionPane.showMessageDialog(null, fcComissionado.calculaProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);				
				break;
			
			case 3:
					
				salario=Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
				valorProventos=Double.parseDouble(JOptionPane.showInputDialog("Tipo do provento: "));
				FProdutividade fProdutividade = new FProdutividade(matricula, null, salario, valorProventos, nome, 0);
				JOptionPane.showMessageDialog(null, fProdutividade.calculaProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);	
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes.");	
				break;
				
			} 
			
		} while(opcao!=4);
	
	}
}

