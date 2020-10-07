package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompra {
    private double total;
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        //produto.aplicarDescontoDe(.15);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
