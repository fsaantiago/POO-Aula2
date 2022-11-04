package br.com.edicao;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		/*variaveis de edicao*/
		int numero, volume,tiragem;
		String dataEdicao;
		
		/*variaveis da revista*/
		String tituloRevista,periodicidade;
		long issn;
		
		/*variaveis do artigo*/
		String titulo,resumo,autores;
		
		/*informacoes da revista*/
		tituloRevista=JOptionPane.showInputDialog("Titulo da revista: ");
		periodicidade=JOptionPane.showInputDialog("Periodicidade: ");
		issn=Long.parseLong(JOptionPane.showInputDialog("Titulo da revista: "));
		
		/*informacoes da edicao*/
		numero=Integer.parseInt(JOptionPane.showInputDialog("Numero da edicao: "));
		volume=Integer.parseInt(JOptionPane.showInputDialog("Volume da edicao: "));		
		tiragem=Integer.parseInt(JOptionPane.showInputDialog("Tiragem da edicao: "));	
		dataEdicao=JOptionPane.showInputDialog("Titulo da revista: ");
		
		Edicao ed1 = new Edicao(numero,volume,dataEdicao,tiragem);
		
		RevistaCientifica revista1 = new RevistaCientifica(tituloRevista,issn,periodicidade);
		
		ArrayList<Artigo> artigos = new ArrayList();
		
		for(int i=0;i<10;i++) {
		
			/*informacoes do artigo*/
			titulo=JOptionPane.showInputDialog("Titulo do artigo: ");
			resumo=JOptionPane.showInputDialog("Resumo do artigo:");
			autores=JOptionPane.showInputDialog("Autores do artigo: ");
			
			artigos.add(new Artigo(titulo,resumo,autores));
			ed1.adicionaArtigos(artigos.get(i));
		}
	}
}
