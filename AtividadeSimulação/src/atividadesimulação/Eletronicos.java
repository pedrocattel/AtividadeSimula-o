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
public class Eletronicos extends Produto {
    
    
    public Eletronicos(double valor, double altura, double comprimento, double largura){
        this.valor = valor;
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
        this.tipo = "Eletronico";
    }
    
    @Override
    public String getTipo(){
        return this.tipo;
    }
    
    @Override
    public double getVolume(){
        return (this.altura * this.largura * this.comprimento);
    }
}
