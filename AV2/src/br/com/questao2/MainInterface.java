package br.com.questao2;
import javax.swing.JOptionPane;

public class MainInterface {
    public static void main(String[] args) {
        AchadoPerdido achadoPerdido = new AchadoPerdido("teste", "teste sendo testado", "Teste do teste", "Achou");
        achadoPerdido.completaDados("Foto de teste", "New York", "23-12-2022");
        boolean busca = achadoPerdido.buscarTitulo(achadoPerdido.getTitulo());
        if (busca == true) {
            JOptionPane.showMessageDialog(null, "Titulo não foi encotrado");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o titulo buscado, tente novamente");
        }
        JOptionPane.showMessageDialog(null, achadoPerdido.verDetalhe());
    }
}
