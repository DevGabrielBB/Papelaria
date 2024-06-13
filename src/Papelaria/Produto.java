package Papelaria;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Produto {
    private int codigo;
    private double preco;
    private String descricao;

    private double frete;
    private DataFabricacao dataFabri;

    public double calcularFrete(int km) {
        double valor = km * 1.05;
        return valor;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public DataFabricacao getDataFabri() {
        return dataFabri;
    }

    public void setDataFabri(DataFabricacao dataFabri) {
        this.dataFabri = dataFabri;
    }

    public void calcularFrete(char regiao) {
        switch (regiao) {
            case 'I':
                System.out.println("Interior");
                this.frete = 100;
                break;
            case 'M':
                System.out.println("Metropolitana");
                break;
            case 'L':
                System.out.println("Litoral");
                break;
            default:
                System.out.println("I: Interior \nM: Metropolitana \nL: Litoral");
                break;

        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void inserirDados() {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
        this.preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
        this.descricao = JOptionPane.showInputDialog("Descrição");
    }

    @Override
    public String toString() {
        NumberFormat converter = DecimalFormat.getCurrencyInstance();
        String texto = "\nEste produto é um " + this.descricao +
                ", possui o código " + this.codigo +
                " e custa " + converter.format(this.preco);
        return texto;
    }
}
