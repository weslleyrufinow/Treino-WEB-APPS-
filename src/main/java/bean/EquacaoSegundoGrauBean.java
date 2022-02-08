/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Iterator;
import javax.enterprise.context.SessionScoped;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

import modelo.EquacaoSegundoGrau;

@Named("equacaoSegundoGrauBean")
@SessionScoped
public class EquacaoSegundoGrauBean implements Serializable{
    private EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
    private double x1,x2;
    public EquacaoSegundoGrau getEquacao(){
        return equacao;
    }
	

	public void submeter(){
                x1=0;
                x2=0;
                try {   
                    x1=equacao.x1();
                    x2=equacao.x2();
                } catch (Exception e){
            	    	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Nao existe raizes reais", ""));
                    
                }    
        }
             
	public double getX1(){
           return x1;
        }
	

	public double getX2(){
           return x2;
	}
	
}
