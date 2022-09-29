package br.com.ex03;
import javax.swing.JOptionPane;

public class MainVeiculo {

	public static void main(String[] args) {
	
		String placa;
		int ano;
		int assentos;
		int eixos;
		int opcao;
		
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de veiculo que deseja saber as informacoes:\n<1>Caminhao\n<2>Onibus:\n<3>Sair"));
			switch (opcao)
			{
			case 1:
				ano=Integer.parseInt(JOptionPane.showInputDialog("Ano do veiculo: "));
				eixos=Integer.parseInt(JOptionPane.showInputDialog("Digite quantos eixos o caminhao possui: "));
				placa=JOptionPane.showInputDialog("Qual o ano do veiculo? ");
				Caminhao caminhao = new Caminhao(ano, null, eixos, placa);
				JOptionPane.showMessageDialog(null, caminhao.exibirDados(), "Mensagem", JOptionPane.DEFAULT_OPTION);				
				break;
			
			case 2:
				placa=JOptionPane.showInputDialog("Qual o ano do veiculo? ");
				ano=Integer.parseInt(JOptionPane.showInputDialog("Ano do veiculo: "));
				assentos=Integer.parseInt(JOptionPane.showInputDialog("Digite quantos eixos o caminhao possui: "));
				Onibus onibus = new Onibus(placa, null, ano, assentos);
				JOptionPane.showMessageDialog(null, caminhao.exibirDados(), "Mensagem", JOptionPane.DEFAULT_OPTION);				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes.");	
				break;
			}
			
		} while (opcao != 3);
	} 
	
}
