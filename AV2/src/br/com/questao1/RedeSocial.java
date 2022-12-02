package br.com.questao1;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RedeSocial {
  private String dataCriacao;
  private String nomUsuario;
  private String dataNasc;
  private String senha;

  private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

  public RedeSocial(String nomUsuario, String dataNasc, String senha) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    this.dataCriacao = dateFormat.format(new Date());
    this.nomUsuario = nomUsuario;
    this.dataNasc = dataNasc;
    this.senha = senha;
  }

  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public String getNomUsuario() {
    return nomUsuario;
  }

  public void setNomUsuario(String nomUsuario) {
    this.nomUsuario = nomUsuario;
  }

  public String getDataNascimento() {
    return dataNasc;
  }

  public void setDataNascimento(String dataNasc) {
    this.dataNasc = dataNasc;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public ArrayList<Publicacao> getPublicacoes() {
    return publicacoes;
  }


  public void imprimePublicacoes() {
	    System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
	    for (Publicacao publicacao : publicacoes) {
	      System.out.println("Data e hora da publicação: " + publicacao.getDataPubli());
	      System.out.println("Publicação: " + publicacao.getTextoPubli());
	      System.out.println("Link: " + publicacao.getTextoPubli());
	    }
	    
  public void inserePubli(Publicacao publi) {
    this.publicacoes.add(publi);
  }
 
  }
  public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
	    this.publicacoes = publicacoes;
	  }
}
