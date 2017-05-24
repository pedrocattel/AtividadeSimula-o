/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulação;

/**
 *
 * @author pedrocattel
 */
public abstract class Produto {
   protected double valor;
   protected double altura;
   protected double largura;
   protected double comprimento;
   protected String tipo;
   
public double getValor(){
    return valor;
}

public double getAltura(){
    return altura;
}

public double getComprimento() {
        return comprimento;
    }

public double getLargura() {
        return largura;
    }
public String getTipo(){
    return tipo;
}
        



public abstract double getVolume();
}
