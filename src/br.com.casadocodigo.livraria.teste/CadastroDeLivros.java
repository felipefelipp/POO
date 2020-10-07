package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setNome("Felicio");
        autor1.setCpf("000.000.999-40");
        autor1.setEmail("lipesantos.gtt@gmail.com");

        Livro livro1 = new LivroFisico(autor1);
        livro1.setNome("A volta dos que não foram");
        livro1.setDescricao("Editora Zé Careca");
        livro1.setValor(44.56);
        System.out.println(livro1.temAutor());
        livro1.mostrarDetalhes();


        /*Autor autor2 = new Autor();
        autor2.setNome("Joao");
        autor2.setCpf("888.550.779-40");
        autor2.setEmail("xuxu@quadrado.com");

        Livro livro2 = new Livro(autor2);
        livro2.setNome("Dinossauros");
        livro2.setDescricao("Editora Pré Historica");
        livro2.setIsbn("9856-565-21d");
        livro2.setValor(45.11);
        livro2.mostrarDetalhes();*/
    }


}
