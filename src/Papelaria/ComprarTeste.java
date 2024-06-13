package Papelaria;

public class ComprarTeste {
    public static void main(String[] args) {

        ProdutoTeste lapis = new Lapis();
        ProdutoTeste papel = new Papel();

        lapis.calcularFrete(5);

        CarrinhodeCompras meuCarrinho = new CarrinhodeCompras();
        meuCarrinho.adicionar(lapis);
        meuCarrinho.adicionar(papel);
    }
}