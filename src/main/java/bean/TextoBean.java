/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import modelo.Texto;

/**
 *
 * @author placido
 */
@Named("textoBean")
@SessionScoped
public class TextoBean implements Serializable{
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public int contagem(){
        return texto.length();
    }
    
    
    
}
