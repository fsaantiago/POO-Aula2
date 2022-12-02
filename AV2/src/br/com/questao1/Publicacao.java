package br.com.questao1;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Publicacao {
  private String dataPubli;
  private String textoPubli;
  private String linkPubli;
  public static double contadorPublicacao;

  public Publicacao(String textoPubli, String linkPubli) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    this.dataPubli = dateFormat.format(new Date());
    this.textoPubli = textoPubli;
    this.linkPubli = linkPubli;
    contadorPublicacao++;
  }

  public String getDataPubli() {
	return dataPubli;
}

public void setDataPubli(String dataPubli) {
	this.dataPubli = dataPubli;
}

public String getTextoPubli() {
	return textoPubli;
}

public void setTextoPubli(String textoPubli) {
	this.textoPubli = textoPubli;
}

public String getLinkPubli() {
	return linkPubli;
}

public void setLinkPubli(String linkPubli) {
	this.linkPubli = linkPubli;
}

public static void setContadorPublicacao(double contadorPublicacao) {
	Publicacao.contadorPublicacao = contadorPublicacao;
}

public static double getContadorPublicacao() {
    return contadorPublicacao;
  }
}
