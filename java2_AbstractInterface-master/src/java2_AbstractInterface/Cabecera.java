package java2_AbstractInterface;

public class Cabecera extends Medico implements Consulta{
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getDni(){
		return DNI;
	}
	
	public void setDni(String DNI){
		this.DNI = DNI;
	}
	
	//medico
	@Override
	public void diagnosticar(){
		System.out.print("Consulta realizada");
	}
	@Override
	public void recetar(){
		System.out.print("Receta realizada");
	}
	
	//consulta
	@Override
	public void pasarconsulta(){
		System.out.print("cita pedida");
	}
	
}
