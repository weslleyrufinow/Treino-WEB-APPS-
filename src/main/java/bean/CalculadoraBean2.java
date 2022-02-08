/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Calculadora2;

/**
 *
 * @author placido
 */
@Named("calculadoraBean2")
@SessionScoped
public class CalculadoraBean2 implements Serializable{

private Calculadora2 calculadora2 = new Calculadora2();  //model

public Calculadora2 getCalculadora2() {
	return calculadora2;
}

}
