package com.zubiri.matriculas;
import java.util.ArrayList;

public class Profesores {
		
	private static ArrayList<Profesor> profesores = new ArrayList<Profesor>();	
		
	 public static Profesor buscarProfesor(String nombre) {
			
		int i = 0;
		Profesor profesor = null;
		try{
			
			do {		
				if (profesores.get(i).getNombre().equalsIgnoreCase(nombre)) {
					profesor = (Profesor)profesores.get(i);
				}
				i++;
			} while ((profesor == null) && (i < profesores.size()));
			
			if (profesor == null) {
				System.out.println("No se ha encontrado el profesor. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return profesor;
	}
		 
	public static void mostrarProfesores() {
		
		if (profesores.size() == 0) {
			System.out.println("Profesores vacio");
		}
		for (int i = 0;i < profesores.size();i++) {
			System.out.println(profesores.get(i).formatted());
		}
	}
}


