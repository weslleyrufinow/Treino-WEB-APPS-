/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Maiusculo;

@Named("maiusculoBean")
@SessionScoped
public class MaiusculoBean implements Serializable{
        Maiusculo m = new Maiusculo();
        
        public Maiusculo getMaiusculo(){
           return m;
        }    

}
