/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author placido
 */
public class Homem {
    private int quantidade=0;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void acrescentar(){
        quantidade++;
        System.out.println(quantidade);
    }
    
    public String imprimir(){
        acrescentar();
        return "Homem";
    }
            
    
    
}
