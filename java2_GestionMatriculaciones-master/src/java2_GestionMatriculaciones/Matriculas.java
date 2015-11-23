package java2_GestionMatriculaciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Matriculas {
	//Atributos
	static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

	public Matriculas(Scanner sc) {
		int opcion;
		System.out.println("Cuantas matriculas son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
			matriculas.add(new Matricula(sc));
		}
	}
	
	//Crear matriculas
	public static ArrayList<Matricula> CrearMatriculas(Scanner sc) {
		int opcion;
		System.out.println("Cuantas matriculas son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
			matriculas.add(new Matricula(sc));
		}
		return matriculas;
	}
	
	//String de matriculas formateado
	public static String formatted(){
		String strMatriculas = "";
		try{
		strMatriculas =
				"\n******MATRICULAS REALIZADAS*****";
		for (int i = 0; i < matriculas.size(); i++) {
			strMatriculas += matriculas.get(i).formatted();
		}
		
			strMatriculas += 
				"\n*******FIN********";
		}
		catch(Exception e)
		{
			System.out.print("Error:" + e);
		}
		return strMatriculas;
			
	}
	
	//String de matriculas formateado
		public static String formatted(ArrayList<Matricula> matriculas){
			String strMatriculas = "";
			try{
			strMatriculas =
					"\n******MATRICULAS REALIZADAS*****";
			for (int i = 0; i < matriculas.size(); i++) {
				strMatriculas += matriculas.get(i).formatted();
			}
			
				strMatriculas += 
					"\n*******FIN********";
			}
			catch(Exception e)
			{
				System.out.print("Error:" + e);
			}
			return strMatriculas;
				
		}
	
	//Metodo que busca por nombre y devuelve una matricula del ArrayList matriculas 
  	public static Matricula obtainMatricula(String nombre){
  		int i = 0;
		Matricula matricula = null;
		try{
			
			do {		
				if (matriculas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					matricula = (Matricula)matriculas.get(i);
				}
				i++;
			} while ((matricula == null) && (i < matriculas.size()));
			
			if (matricula == null) {
				System.out.println("No se ha encontrado el profesor. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return matricula;
  	}
  	
  //Metodo que busca por nombre y devuelve una asignatura del ArrayList asignaturas 
  	public static Matricula obtainMatricula(Scanner sc){
  		int i = 0;
		Matricula matricula = null;
		try{
			
			do {		
				if (matriculas.get(i).getNombre().equalsIgnoreCase(sc.next())) {
					matricula = (Matricula)matriculas.get(i);
				}
				i++;
			} while ((matricula == null) && (i < matriculas.size()));
			
			if (matricula == null) {
				System.out.println("No se ha encontrado la matricula. Se cierra el programa.");
				System.exit(-1);
			}
		}
		catch (Exception e)
		{
			System.out.print("Error: " + e);
		}

		return matricula;
  	}
  	
  	public static void leerMatriculas(String fichero) throws IOException {
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
				System.out.println("No existen matriculas en el fichero");
			}
			
			while ((linea != null) && (linea.compareTo("") != 0)) {
				    Matricula matricula = new Matricula(linea,',');
					matriculas.add(matricula);
				
				linea = br.readLine();
			}
			br.close();
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
	 }
  	
  	
}
