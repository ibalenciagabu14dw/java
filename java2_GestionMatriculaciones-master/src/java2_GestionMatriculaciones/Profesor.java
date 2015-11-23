package java2_GestionMatriculaciones;
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
	
	public Profesor(String lineaProfesor, char separator) {
		super(lineaProfesor, separator);
		try{
			split(lineaProfesor,separator);
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
	}
	
	public void split(String strProfesor, char separator) {
		if (strProfesor == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = strProfesor.split(Character.toString(separator));
			
			this.setDni(parametros[0]);
			this.setNombre(parametros[1]);
			this.setApellido(parametros[2]);
			this.setTitulacion(parametros[3]);
			this.setDepartamento(parametros[4]);
			
		}
	}
	
	public Profesor splitReturn(String strProfesor, char separator) {
		if (strProfesor == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = strProfesor.split(Character.toString(separator));
			
			this.setDni(parametros[0]);
			this.setNombre(parametros[1]);
			this.setApellido(parametros[2]);
			this.setTitulacion(parametros[3]);
			this.setDepartamento(parametros[4]);
		}
		return this;
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
