package com.zubiri.matriculas;
import java.util.Scanner;

public class Profesor extends Persona {
	
	String titulacion;
	String departamento;
	
	//Constructor
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento){
		super(dni, nombre, apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
	}
	
	//Contructor 2
	public Profesor(Scanner sc){
		super(sc);
		System.out.println("Introduce la TITULACION: ");
		this.setTitulacion(sc.next());
		System.out.println("Introduce el DEPARTAMENTO: ");
		this.setDepartamento(sc.next());
	}
	@Override
	public String formatted(){
		String strProfesor =
				super.formatted() + 
				"\nTITULACION: \t" + this.getTitulacion() +
				"\nDEPARTAMENTO: " + this.getDepartamento();
		return strProfesor;
	}
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
