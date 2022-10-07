package br.com.projeto;
import javax.swing.JOptionPane;

public class MainProjeto {

	public static void main(String[] args) {
		int opcao;
		String descAlimento;
		float qtde;
		String tipoTrabalho;
		int duracaoTrabalho;
		
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo do projeto:\n<1>Cadastrar Projeto Distribuir Alimentos\n<2>Cadastrar Projeto Trabalho Voluntário\n<3>Sair"));
			switch (opcao)
			{			
			case 1:
				
				descAlimento=JOptionPane.showInputDialog("Descricao do Alimento: ");
				qtde=Float.parseFloat(JOptionPane.showInputDialog("Quantidade : "));
				DistribuicaoAlimento dA1 = new DistribuicaoAlimento(null, descAlimento, tipoTrabalho, tipoTrabalho, tipoTrabalho, tipoTrabalho, qtde);
				JOptionPane.showMessageDialog(null, dA1.imprimeProjeto(tipoTrabalho, qtde), "Mensagem", JOptionPane.DEFAULT_OPTION);		
				break;
			
			case 2:
				
				tipoTrabalho=JOptionPane.showInputDialog("Cadastre o tipo de trabalho: ");
				duracaoTrabalho=Integer.parseInt(JOptionPane.showInputDialog("Tipo do provento: "));
				TrabalhoVoluntario tV1 = new TrabalhoVoluntario(tipoTrabalho, tipoTrabalho, descAlimento, null, null, null, duracaoTrabalho);
				JOptionPane.showMessageDialog(null, tV1.imprimeProjeto(tipoTrabalho, duracaoTrabalho), "Mensagem", JOptionPane.DEFAULT_OPTION);				
				break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes.");	
				break;
			} 
			
		} while(opcao!=3);	
		

	}

}
