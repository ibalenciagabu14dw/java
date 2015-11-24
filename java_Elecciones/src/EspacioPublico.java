public abstract class EspacioPublico
{
	private int id;
	private String nombre;
	private String direccion;
	private String poblacion;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}

	void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	String getNombre()
	{
		return nombre;
	}

	void setDireccion(String direccion)
	{
		this.direccion=direccion;
	}
	String getDireccion()
	{
		return direccion;
	}

	void setPoblacion(String poblacion)
	{
		this.poblacion=poblacion;
	}
	String getPoblacion()
	{
		return poblacion;
	}
	
	abstract void mostrar();
}