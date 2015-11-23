package java2_AbstractInterface;

public abstract class Medico {
	
	protected String nombre;
	protected String apellido;
	protected String DNI;
	
	abstract void diagnosticar();
	abstract void recetar();
}
