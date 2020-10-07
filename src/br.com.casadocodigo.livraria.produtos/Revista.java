package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Revista implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora() {
        this.editora = editora;
    }

    public boolean aplicarDescontoDe(double porcentagem) {
        if(porcentagem > 0.1) {
            return false;
        }
        setValor(getValor() - (getValor() * porcentagem));
        return true;
    }
}
