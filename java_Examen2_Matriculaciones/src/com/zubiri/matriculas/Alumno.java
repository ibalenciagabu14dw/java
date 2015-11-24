package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	//Ano en el que se inscribio por primera vez en alguna asignatura
	int anoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	//Matriculas realizadas a lo largo de los anos en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	//Constructor
	public Alumno(String dni, String nombre, String apellido, int anoInscripcion, String ciclo, ArrayList<Matricula> matriculas){
		super(dni, nombre, apellido);
		this.anoInscripcion = anoInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;
	}
	
	//Contructor 2
	public Alumno(Scanner sc){
		super(sc);
		System.out.println("Introduce el ANO de inscripcion: ");
		this.setAnoInscripcion(sc.nextInt());
		System.out.println("Introduce el CICLO de inscripcion: ");
		this.setCiclo(sc.next());
		this.setMatriculas(Matriculas.crearMatriculas(sc));
	}
	
	//Alumno formateado en un String
	@Override
	public String formatted(){
		String strAlumno =
			super.formatted() + 
			"\nANO \t" + this.getAnoInscripcion() +
			"\nCLICLO: " + this.getCiclo() + 
			Matriculas.formatted(this.getMatriculas());
			
		return strAlumno;
	}

	public int getAnoInscripcion() {
		return anoInscripcion;
	}
	
	public void setAnoInscripcion(int anoInscripcion) {
		this.anoInscripcion = anoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
