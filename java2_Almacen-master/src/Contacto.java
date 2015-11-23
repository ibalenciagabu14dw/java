import java.util.ArrayList;

public class Contacto extends Persona
{
	
	private int telefono;
	
	//creamos el ArrayList de clientes
	static ArrayList <Contacto> acontactos = new ArrayList <Contacto>();				
	
	
	//telefono
	public void setTelefono(int telefono)
	{
		this.telefono=telefono;
	}
	public int getTelefono()
	{
		return telefono;
	}
}