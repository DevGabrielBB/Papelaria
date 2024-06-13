package Papelaria;

import javax.swing.JOptionPane;

public class TesteDataFabricacao {
    public static void main(String[] args) {
        DataFabricacao minhaData = new DataFabricacao();
        minhaData.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia ")));
        minhaData.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês ")));
        minhaData.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano ")));

        JOptionPane.showMessageDialog(null, minhaData.dataCompleta());
    }
}
