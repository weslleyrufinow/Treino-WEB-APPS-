/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author placi
 */
public class Programa {
    public static void main(String[] args) {
        EquacaoSegundoGrau e = new EquacaoSegundoGrau();
        e.setA(1);
        e.setB(2);
        e.setC(3);

        try {
            System.out.println(e.x1());
            System.out.println(e.x2());
        } catch (Exception ex) {
            System.out.println("Não existe variáveis reais");
        }
        
    }
    
}
