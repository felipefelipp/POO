package br.com.casadocodigo.livraria.produtos;

public interface Promocional {
  
    boolean aplicarDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicarDescontoDe(.1);
    }
}
