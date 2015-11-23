package java2_GestionMatriculaciones;

import java.util.Scanner;

public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;
	
	//Costructor
	public Persona(String dni, String nombre, String apellido){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//Costructor 2
	public Persona(Scanner sc){
		System.out.println("\nIntroduce el DNI de la persona: ");
		this.setDni(sc.next());
		System.out.println("Introduce el NOMBRE de la persona: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el APELLIDO de la persona: ");
		this.setApellido(sc.next());
	}
	
	public Persona(String lineaPersona, char separator) {
		
		try{
			split(lineaPersona,separator);
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		String strPersona  =
				"\nDNI:\t" + this.getDni() + "\n"
				+ "NOMBRE:\t" + this.getNombre() + "\n"
				+ "APELLIDO: "	+ this.getApellido();
				
				return strPersona;
	}
	
	/* Metodo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.	 */
	public void split(String personaStr, char separator) {
		if (personaStr == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = personaStr.split(Character.toString(separator));
			this.setDni(parametros[0]);
			this.setNombre(parametros[1]);
			this.setApellido(parametros[2]);
		}
	}
}
