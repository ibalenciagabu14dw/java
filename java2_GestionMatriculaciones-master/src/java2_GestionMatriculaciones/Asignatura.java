package java2_GestionMatriculaciones;

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
		System.out.println("Introduce el nombre del profesor: ");
		//si el profesor no existe, le da de alta
		if  (Personas.obtainProfesor(sc.next()) == null)
		this.setProfesor(new Profesor(sc));
		//sino asigna la informacion del profesor ya existente
		else this.setProfesor(Personas.obtainProfesor(sc.next()));
	}
	
	public Asignatura(String lineaAsignatura, char separator) {
		
		try{
			split(lineaAsignatura,separator);
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
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
	public void split(String asignaturaStr, char separator) {
		if (asignaturaStr == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = asignaturaStr.split(Character.toString(separator));
			this.setNombre(parametros[0]);
			this.setCreditos(Integer.parseInt(parametros[1]));
			String[] Profesor = parametros[2].split("#");
			this.setProfesor(new Profesor(Profesor[0], Profesor[1], Profesor[2],Profesor[3],Profesor[4]));
		}
	}

}
