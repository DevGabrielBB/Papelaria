package Exemploparacontrutores;

import javax.swing.JOptionPane;

public class TesteData {
    public static void main(String[] args) {
        int mesTeste = Integer.parseInt(JOptionPane.showInputDialog("Mês"));
        int anoTeste = Integer.parseInt(JOptionPane.showInputDialog("Ano"));

        Data data1 = new Data(mesTeste, anoTeste);

        String texto = "Mês e Ano" + data1.getMes() + "/" + data1.getAno();

        JOptionPane.showMessageDialog(null, texto);

    }

}
