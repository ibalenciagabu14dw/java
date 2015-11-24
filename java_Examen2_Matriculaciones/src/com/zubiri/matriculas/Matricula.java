package com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	//Atributos
	int anoMatriculacion;
    double precio;
    
    //Constructor 1
  	public Matricula(String nombre, int creditos, Profesor profesor, int anoMatriculacion, double precio){
  		super(nombre, creditos, profesor);
  		this.anoMatriculacion = anoMatriculacion;
  		this.precio = precio;
  	}
  	//Constructor 2
  	public Matricula(Scanner sc){
  		super(sc);
  		System.out.println("Introduce el ANO de matriculacion: ");
  		this.setAnoMatriculacion(sc.nextInt());
  		System.out.println("Introduce el PRECIO de matriculacion: ");
  		this.setPrecio(sc.nextDouble());
  	}
  	
  	@Override
	public String formatted(){
  		String strMatricula =
				super.formatted() + 
				"\nANO: \t" + this.getAnoMatriculacion() +
				"\nPRECIO: " + this.getPrecio() +
				"\nPRECIO DESCONTADO: " + this.descuentoFamiliaNumerosa(pedirPorcentaje());
				
		return strMatricula;
	}
  	
   	
  	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}
	
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	//Metodo que recoje el porcentaje de familia numerosa
	public int pedirPorcentaje()
	{
		 Scanner sc = null;
		 System.out.println("Introduce el PORCENTAJE de familia numerosa: ");
		 return sc.nextInt();
	}
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		Double descuento = this.precio * porcentaje / 100;
		return descuento;
	}
	
}
