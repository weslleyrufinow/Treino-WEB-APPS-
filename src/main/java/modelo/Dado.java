/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author placido
 */
public class Dado {
    public int joga(){
        return new Random().nextInt(5)+1;
    }
    
}
