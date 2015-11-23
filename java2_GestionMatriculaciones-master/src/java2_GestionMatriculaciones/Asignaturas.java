package java2_GestionMatriculaciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Asignaturas {
	//Atributos
		static ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

		//Crear asignaturas
		public Asignaturas(Scanner sc){
			int opcion;
			System.out.println("Cuantas asignaturas son?: ");
			opcion = sc.nextInt();
			for (int a = 0; a < opcion; a++) {
				asignaturas.add(new Asignatura(sc));
			}
		}
		
		public static void leerAsignaturas(String fichero) throws IOException {
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
					Asignatura asignatura = new Asignatura(linea,',');
					asignaturas.add(asignatura);
					linea = br.readLine();
				}
				br.close();
			}
			catch(Exception e){
				System.out.print("Error: " + e);
			}
		 }
		
		//Crear asignaturas
		public static ArrayList<Asignatura> CrearAsignaturas(Scanner sc) {
			int opcion;
			System.out.println("Cuantas asignaturas son?: ");
			opcion = sc.nextInt();
			for (int a = 0; a < opcion; a++) {
				asignaturas.add(new Asignatura(sc));
			}
			return asignaturas;
		}
		
		//String de asignaturas formateado
		public static String formatted(){
			String strAsignaturas = "";
			try{
				strAsignaturas =
					"\n******ASIGNATURAS DEL CENTRO*****";
			for (int i = 0; i < asignaturas.size(); i++) {
				strAsignaturas += asignaturas.get(i).formatted();
			}
			
			strAsignaturas += 
					"\n*******FIN********";
			}
			catch(Exception e)
			{
				System.out.print("Error:" + e);
			}
			return strAsignaturas;
				
		}
		
		//Metodo que busca por nombre y devuelve una asignatura del ArrayList asignaturas 
	  	public static Asignatura obtainAsignatura(String nombre){
	  		int i = 0;
			Asignatura asignatura = null;
			try{
				
				do {		
					if (asignaturas.get(i).getNombre().equalsIgnoreCase(nombre)) {
						asignatura = (Asignatura)asignaturas.get(i);
					}
					i++;
				} while ((asignatura == null) && (i < asignaturas.size()));
				
				if (asignatura == null) {
					System.out.println("No se ha encontrado la matricula. Se cierra el programa.");
					System.exit(-1);
				}
			}
			catch (Exception e)
			{
				System.out.print("Error: " + e);
			}

			return asignatura;
	  	}
	  	
	  //Metodo que busca por nombre y devuelve una asignatura del ArrayList asignaturas 
	  	public static Asignatura obtainAsignatura(Scanner sc){
	  		int i = 0;
			Asignatura asignatura = null;
			try{
				
				do {		
					if (asignaturas.get(i).getNombre().equalsIgnoreCase(sc.next())) {
						asignatura = (Asignatura)asignaturas.get(i);
					}
					i++;
				} while ((asignatura == null) && (i < asignaturas.size()));
				
				if (asignatura == null) {
					System.out.println("No se ha encontrado la matricula. Se cierra el programa.");
					System.exit(-1);
				}
			}
			catch (Exception e)
			{
				System.out.print("Error: " + e);
			}

			return asignatura;
	  	}
}
