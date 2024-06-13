package Papelaria;

public class TesteProdutoDataFabri {

    public static void main(String[] args) {
        DataFabricacao dtFabri = new DataFabricacao();
        dtFabri.setDia(07);
        dtFabri.setMes(11);
        dtFabri.setAno(2022);

        Produto produto1 = new Produto();
        produto1.setDescricao("Caneta azul");
        produto1.setDataFabri(dtFabri);

        System.out.println("Produto: " + produto1.getDescricao());
        System.out.println("Data: " + produto1.getDataFabri().dataCompleta());

    }

}
