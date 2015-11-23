package java2_GestionMatriculaciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Personas {
	static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public Personas(Scanner sc) throws Exception {
			System.out.println("Que PERSONA quieres insertar?");
			System.out.println("1. ALUMNO");
			System.out.println("2. PROFESOR");
			
			switch(sc.nextInt()) {
				case 1:
					personas.add(new Alumno(sc));
					break;
				case 2:
					personas.add(new Profesor(sc));
					break;
				default:
					System.out.println("No ha insertado la opcion correcta.");
					break;
			}			
		}
	
	public static ArrayList<Persona> CrearPersonas(Scanner sc) throws Exception {
		System.out.println("Que PERSONA quieres insertar?");
		System.out.println("1. ALUMNO");
		System.out.println("2. PROFESOR");
		
		switch(sc.nextInt()) {
			case 1:
				personas.add(new Alumno(sc));
				break;
			case 2:
				personas.add(new Profesor(sc));
				break;
			default:
				System.out.println("No ha insertado la opcion correcta.");
				break;
		}		
		return personas;
	}
	
	//String de Personas formateado
		public static String formattedPersonas(ArrayList<Persona> personas){
			String strPersonas = "";
			try{
				strPersonas =
					"\n******PERSONAS EN EL CENTRO*****";
			for (int i = 0; i < personas.size(); i++) {
				strPersonas += personas.get(i).formatted();
			}
			strPersonas += 
					"\n*******FIN********";
			}
			catch(Exception e)
			{
				System.out.print("Error:" + e);
			}
			return strPersonas;
				
		}	
		
		//Metodo que busca por nombre y devuelve una persona del ArrayList personas 
		public static Persona obtainPersona(String nombre) {
				
			int i = 0;
			Persona persona = null;
			try{
				
				do {		
					if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
						persona = (Alumno)personas.get(i);
					}
					i++;
				} while ((persona == null) && (i < personas.size()));
				
				if (persona == null) {
					System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
					System.exit(-1);
				}
			}
			catch (Exception e)
			{
				System.out.print("Error: " + e);
			}

			return persona;
		}
		
	//Metodo que busca por nombre y devuelve una persona del ArrayList personas 
	public static Persona obtainPersona(Scanner sc) {
			
		int i = 0;
		Persona persona = null;
		try{
			
			do {		
				if (personas.get(i).getNombre().equalsIgnoreCase(sc.next())) {
					persona = (Alumno)personas.get(i);
				}
				i++;
			} while ((persona == null) && (i < personas.size()));
			
			if (persona == null) {
				System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return persona;
	}
		
	//String de Profesores formateado
	public String formattedProfesores(ArrayList<Persona> personas){
		String strProfesores = "";
		try{
		strProfesores =
				"\n******PROFESORES EN EL CENTRO*****";
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Profesor")
				strProfesores += personas.get(i).formatted();
		}
		strProfesores += 
				"\n*******FIN********";
		}
		catch(Exception e)
		{
			System.out.print("Error:" + e);
		}
		return strProfesores;
			
	}	
	
	//Metodo que busca por nombre y devuelve un profesor del ArrayList personas 
	public static Profesor obtainProfesor(String nombre) {
		
		System.out.println("Introduce el nombre del profesor: ");
		
		int i = 0;
		Profesor profesor = null;
		try{
			
			do {		
				if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Profesor"){
					if (personas.get(i).getNombre().equalsIgnoreCase(nombre)){
						profesor = (Profesor)personas.get(i);
					}
				}
				i++;
			} while ((profesor == null) && (i < personas.size()));
			
			if (profesor == null) {
				System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return profesor;
	}
			
		
	//Metodo que busca por nombre y devuelve un profesor del ArrayList personas 
	public static Profesor obtainProfesor(Scanner sc) {
		
		System.out.println("Introduce el nombre del profesor: ");
		
		int i = 0;
		Profesor profesor = null;
		try{
			
			do {		
				if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Profesor"){
					if (personas.get(i).getNombre().equalsIgnoreCase(sc.next())){
						profesor = (Profesor)personas.get(i);
					}
				}
				i++;
			} while ((profesor == null) && (i < personas.size()));
			
			if (profesor == null) {
				System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return profesor;
	}
	//String de Alumnos formateado
	public static String formattedAlumnos(ArrayList<Persona> personas){
		String strAlumnos = "";
		try{
			strAlumnos =
				"\n******ALUMNOS EN EL CENTRO*****";
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Alumno")
				strAlumnos += personas.get(i).formatted();
		}
		strAlumnos += 
				"\n*******FIN********";
		}
		catch(Exception e)
		{
			System.out.print("Error:" + e);
		}
		return strAlumnos;	
	}
			
	//Metodo que busca por nombre y devuelve un alumno del ArrayList personas 
	public static Alumno obtainAlumno(Scanner sc) {
		
		System.out.println("Introduce el nombre del alumno: ");
		
		int i = 0;
		Alumno alumno = null;
		try{
			
			do {		
				if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Alumno"){
					if (personas.get(i).getNombre().equalsIgnoreCase(sc.next())) {
					alumno = (Alumno)personas.get(i);
					}
				}
				i++;
			} while ((alumno == null) && (i < personas.size()));
			
			if (alumno == null) {
				System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return alumno;
	}
	
	//Metodo que busca por nombre y devuelve un alumno del ArrayList personas 
	public static Alumno obtainAlumno(String nombre) {
		
		System.out.println("Introduce el nombre del alumno: ");
		
		int i = 0;
		Alumno alumno = null;
		try{
			
			do {		
				if (personas.get(i).getClass().getName() == "com.zubiri.matriculas.Alumno"){
					if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					alumno = (Alumno)personas.get(i);
					}
				}
				i++;
			} while ((alumno == null) && (i < personas.size()));
			
			if (alumno == null) {
				System.out.println("No se ha encontrado a la persona indicada. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return alumno;
	}
	
	public static void leerPersonas(String fichero) throws IOException {
		try{
			String linea;
			FileInputStream f;
		    InputStreamReader fr;
		    BufferedReader br;
		    
		    f = new FileInputStream(fichero);
	    	fr = new InputStreamReader(f, "UTF8");
	    	br = new BufferedReader(fr);
	    	linea = br.readLine();
			
			if (linea == null) {
				System.out.println("No existen personas en el fichero");
			}
			
			while ((linea != null) && (linea.compareTo("") != 0)) {
				//si la persona es un alumno
				String[] separada = linea.split(",");
				 if (separada[3] instanceof java.lang.String) {
				    Alumno alumno = new Alumno(linea,',');
					personas.add(alumno);
				}
				//la persona es un profesor
				else{
				Profesor profesor = new Profesor(linea,',');
				personas.add(profesor);
				}
				linea = br.readLine();
			}
			br.close();
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
	 }
}
