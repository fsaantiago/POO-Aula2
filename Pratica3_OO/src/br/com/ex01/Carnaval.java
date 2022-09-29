package br.com.ex01;
import javax.swing.JOptionPane;

public class Carnaval {

	public static void main(String[] args) {
		double valor;
		double valorAdicional;
		int opcao;
		do {
		opcao=Integer.parseInt(JOptionPane.showInputDialog("<1>Ingresso Normal\n<2>Ingresso Vip\n<3>Ingresso Camarote\n<4>Sair"));
			switch(opcao)
				{
					case 1:
					
						valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						IngressoNormal ingressoNormal = new IngressoNormal(valor);
						JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
						break;
					
					case 2:
					
						valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						IngressoVip ingressoVip = new IngressoVip(valor, valorAdicional);
						JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
						break;
					
					case 3:
					
						valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
						String localizacao = JOptionPane.showInputDialog("Localizacao: ");
						Camarote ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);
						JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(),"Mensagem", JOptionPane.DEFAULT_OPTION);
						break;
						
					case 4:
						JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes. ");
						break;
					
				} 				
		} while(opcao!=4);
	}
}

