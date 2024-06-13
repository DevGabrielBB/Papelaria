package Papelaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> listaProdutos = new ArrayList<Produto>();

    public void adicionar(Produto produto) {
        listaProdutos.add(produto);
    }

    public List<Produto> gerarLista() {
        return this.listaProdutos;
    }
}