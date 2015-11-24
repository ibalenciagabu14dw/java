package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura{

	String nombre;
	int creditos;
	Profesor profesor;
	
	//Constructor 1
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	//Constructor 2
	public Asignatura(Scanner sc){
		System.out.println("Introduce el NOMBRE de la asignatura: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el numero de CREDITOS de la asignatura: ");
		this.setCreditos(sc.nextInt());
		this.setProfesor(new Profesor(sc));;
	}
		
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted(){
		String strAsignatura =
				"\nNOMBRE: \t" + this.getNombre() +
				"\nCREDITOS: \t" + this.getCreditos() +
				"\nPROFESOR: \t" + this.profesor.formatted();
		return strAsignatura;
	}
	
	/**
	 * Metodo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
	}

}
