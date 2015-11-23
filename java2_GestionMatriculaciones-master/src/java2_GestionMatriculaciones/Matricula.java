package java2_GestionMatriculaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Matricula extends Asignatura {
	
	//Atributos
	int anoMatriculacion;
    double precio;
    
    //Constructor 1
  	public Matricula(String nombre, int creditos, Profesor profesor, int anoMatriculacion, double precio){
  		super(nombre, creditos, profesor);
  		this.anoMatriculacion = anoMatriculacion;
  		Scanner sc = null;
  		System.out.println("Tienes FAMILIA NUMEROSA?(SI/NO): ");
  		if(sc.next().equalsIgnoreCase("si")){
  			//asigna a precio el valor del precio restando el descuento de familia numerosa
  			this.setPrecio((precio)-(this.descuentoFamiliaNumerosa(pedirPorcentaje())));
  		}
  		else
  			this.setPrecio(precio);
  	}
  	//Constructor 2
  	public Matricula(Scanner sc){
  		super(sc);
  		System.out.println("Introduce el ANO de matriculacion: ");
  		this.setAnoMatriculacion(sc.nextInt());
  		System.out.println("Introduce el PRECIO de matriculacion: ");
  		Double precio= sc.nextDouble();
  		System.out.println("Tienes FAMILIA NUMEROSA?(SI/NO): ");
  		if(sc.next().equalsIgnoreCase("si")){
  			//asigna a precio el valor del precio restando el descuento de familia numerosa
  			this.setPrecio((precio)-(this.descuentoFamiliaNumerosa(pedirPorcentaje())));
  		}
  		else
  			this.setPrecio(precio);
  	}
  	
  	public Matricula(String lineaMatricula, char separator) {
		super(lineaMatricula, separator);
		try{
			split(lineaMatricula,separator);
		}
		catch(Exception e){
			System.out.print("Error: " + e);
		}
	}
  	
  	@Override
	public String formatted(){
  		String strMatricula =
				super.formatted() + 
				"\nANO: \t" + this.getAnoMatriculacion() +
				"\nPRECIO: " + this.getPrecio();
				
		return strMatricula;
	}
  	
   	
  	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}
	
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	//Metodo que recoje el porcentaje de familia numerosa
	public int pedirPorcentaje()
	{
		 Scanner sc = null;
		 System.out.println("Introduce el PORCENTAJE de familia numerosa: ");
		 return sc.nextInt();
	}
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		Double descuento = this.precio * porcentaje / 100;
		return descuento;
	}
	
	public void split(String strMatricula, char separator) {
		if (strMatricula == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = strMatricula.split(Character.toString(separator));
			this.setNombre(parametros[0]);
			Profesor profesor = null;
			this.setCreditos(Integer.parseInt(parametros[1]));
			this.setProfesor(profesor.splitReturn(parametros[2], '#'));
			this.setAnoMatriculacion(Integer.parseInt(parametros[3]));
			this.setPrecio(Double.parseDouble(parametros[4]));
			
		}
	}
	
	public Matricula splitReturn(String strMatricula, char separator) {
		if (strMatricula == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = strMatricula.split(Character.toString(separator));
			this.setNombre(parametros[0]);
			Profesor profesor = null;
			this.setCreditos(Integer.parseInt(parametros[1]));
			this.setProfesor(profesor.splitReturn(parametros[2], '#'));
			this.setAnoMatriculacion(Integer.parseInt(parametros[3]));
			this.setPrecio(Double.parseDouble(parametros[4]));
			
		}
		return this;
	}
	
	public ArrayList<Matricula> splitReturnArrayList(String strMatriculas, char separator) {
  		ArrayList<Matricula> arrayListTemporal = new ArrayList<Matricula>();
  		if (strMatriculas == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String[] parametros = strMatriculas.split(Character.toString(separator));
			this.setNombre(parametros[0]);
			Profesor profesor = null;
			this.setCreditos(Integer.parseInt(parametros[1]));
			this.setProfesor(profesor.splitReturn(parametros[2], '#'));
			this.setAnoMatriculacion(Integer.parseInt(parametros[3]));
			this.setPrecio(Double.parseDouble(parametros[4]));
			arrayListTemporal.add(this);
			
		}
		return arrayListTemporal;
	}
}
