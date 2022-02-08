/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	private double delta(){
		return b*b-4*a*c;
	}

	public double x1() throws Exception{
		
		if (delta()<0 || a==0)
			throw new Exception();
		else
	  	    return (-b-Math.sqrt(delta()))/(2*a);
	}
	

        public double x2() throws Exception{
		if (delta()<0  || a==0)
			throw new Exception();
		else
		   return (-b+Math.sqrt(delta()))/(2*a);
	}
  
}
