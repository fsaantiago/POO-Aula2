package br.com.questao2;


public class AchadoPerdido implements Publicacao {
    private String tituloPubli;
    private String descricaoPubli;
    private String fotoPubli;
    private String tipoPubli;
    private String localAchado;
    private String dataHora;
    private String statusAchado;

    public AchadoPerdido(String tituloPubli, String descricaoPubli, String tipoPubli, String statusAchado) {
        this.tituloPubli = tituloPubli;
        this.descricaoPubli = descricaoPubli;
        this.tipoPubli = tipoPubli;
        this.statusAchado = statusAchado;
    }

    public String getTitulo() {
        return tituloPubli;
    }

    public void completaDados(String fotoPubli, String localAchado, String dataHora) {
        this.fotoPubli = fotoPubli;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    @Override
    public boolean buscarTitulo(String titulo) {
        if (this.tituloPubli.equals(titulo)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String verDetalhe() {
        return "Detalhes :"
        		+ "\nTitulo: " + this.tituloPubli
        		+ "\nDescrição: " + this.descricaoPubli
        		+ "\nFoto: " + this.fotoPubli
                + "\nTipo: " + this.tipoPubli
                + "\nLocal Achado: " + this.localAchado
                + "\nData e Hora: " + this.dataHora
                + "\nStatus do item: " + this.statusAchado;
    }

}
