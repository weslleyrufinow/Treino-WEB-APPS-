/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Dado;

/**
 *
 * @author placido
 */
@Named("dadoBean")
@SessionScoped
public class DadoBean implements Serializable{
    private Dado d = new Dado();
    public Dado getDado(){
        return d;
    }
    
}
