/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Maiusculo {
        private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void aumentar() {

		texto = texto.toUpperCase();

	}
	public void primeiras() {
        int j = 0;
        String  subs  = "";
        String textocorrigido = "";
        for (int i =0; i<texto.length(); i++) {
        	if (i == j) 
        		subs = texto.substring(i, i+1).toUpperCase();
        	else
        		subs = texto.substring(i, i+1).toLowerCase();
        	textocorrigido = textocorrigido + subs;
		    if (texto.substring(i, i+1).equals(" "))
			   j = i +1;
        }		    
         texto=  textocorrigido;
	}
	
	    
}
