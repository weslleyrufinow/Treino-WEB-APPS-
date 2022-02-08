/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author placido
 */
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Named;
import modelo.Homem;
import modelo.Mulher;



@Named("quantidadeBean")
@SessionScoped
public class QuantidadeBean implements Serializable {
     private Mulher m = new Mulher();
     private Homem h = new Homem();
     public Homem getHomem(){
         return h;
     }
     public Mulher getMulher(){
         return m;
     }
     
     
}
