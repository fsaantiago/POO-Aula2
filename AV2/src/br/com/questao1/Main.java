package br.com.questao1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nomUsuario;
    String dataNasc;
    String senha;
    
    /*Leitura dos dados do usuario*/
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o nome do usuario: ");
    nomUsuario = ler.nextLine();
    System.out.println("Digite sua data de nascimento: ");
    dataNasc = ler.nextLine();
    System.out.println("Digite sua senha: ");
    senha = ler.nextLine();
    
    /*Leitura dos dados para RedeSocial*/
    RedeSocial RedeSocial = new RedeSocial(nomUsuario, dataNasc, senha);

    System.out.println("Digite um texto para sua publicacao:");
    String textoPubli = ler.nextLine();
    System.out.println("Link da midia:");
    String linkMidia = ler.nextLine();
    Publicacao publicacao = new Publicacao(textoPubli, linkMidia);
    RedeSocial.inserePubli(publicacao);

    int opcao = 0;
    do {
      System.out.println("Deseja inserir outra? \n <1> Sim <2> Não ");
      opcao = ler.nextInt();

      switch (opcao) {
        case 1:
        ler  = new Scanner(System.in);
          System.out.println("Faca uma publicacao:");
          textoPubli = ler.nextLine();
          System.out.println("Link da midia:");
          linkMidia = ler.nextLine();
          publicacao = new Publicacao(textoPubli, linkMidia);
          RedeSocial.inserePubli(publicacao);
          break;
        case 2:
          opcao = 2;
          break;
        default:
          opcao = 2;
          break;
      }
    } while (opcao != 2);

    RedeSocial.imprimePublicacoes();
  }

}
