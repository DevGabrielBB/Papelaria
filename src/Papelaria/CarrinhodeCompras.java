package Papelaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    List<ProdutoTeste> listaProdutosTeste = new ArrayList<ProdutoTeste>();

    public void adicionar(ProdutoTeste prod) {
        listaProdutosTeste.add(prod);
    }

}