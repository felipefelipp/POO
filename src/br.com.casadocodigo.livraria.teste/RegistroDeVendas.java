package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.teste.CarrinhoDeCompra;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio");


        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(59.90);

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(29.90);
        fisico.aplicaDescontoDe10Porcento();
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        System.out.printf("Total: %.2f", carrinho.getTotal());


    }
}
