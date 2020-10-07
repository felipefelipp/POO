package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autorDeUmLivro = new Autor();
        Livro anabelle = new MiniLivro(autorDeUmLivro);
        anabelle.setValor(59.90);
        System.out.println("---------------------------------------------------");
        System.out.println("Valor Atual: " + anabelle.getValor());
        /*System.out.println(!anabelle.aplicarDescontoDe(0.2) ? "Não é possível aplicar desconto maior que 30%" :
                "Valor com desconto: " + anabelle.getValor());*/

        System.out.println("---------------------------------------------------");

        /*Livro anabelleVersaoDigital = new Ebook(autorDeUmLivro);
        anabelleVersaoDigital.setValor(44.67);
        System.out.println("Valor Atual: " + anabelleVersaoDigital.getValor());
        System.out.println(!anabelleVersaoDigital.aplicarDescontoDe(0.13) ? "Não é possível aplicar desconto maior que 15% para ebook's" :
                "Valor com desconto: " + anabelleVersaoDigital.getValor());
        System.out.println("---------------------------------------------------");
*/


   }
}
