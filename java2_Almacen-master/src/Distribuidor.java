public class Distribuidor
{
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//nombre del distribuidor
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	//CIF
	public void setCif(String cif)
	{
		this.cif=cif;
	}
	public String getCif()
	{
		return cif;
	}

	//direccion
	public void setDireccion(Direccion direccion)
	{
		this.direccion=direccion;
	}
	public Direccion getDireccion()
	{
		return direccion;
	}

	//contacto
	public void setContacto(Contacto contacto)
	{
		this.personaContacto=contacto;
	}
	public Contacto getContacto()
	{
		return personaContacto;
	}	
	
	public Distribuidor buscarDistribuidor(String distri)
	{
		Distribuidor distribuidor;
		//recorremos el ArrayList de distribuidores para buscar el introducido
		for(int j=0; j<Distribuidores.adistribuidores.size(); j++)
		{
			//si lo encontramos
			if (distri.equalsIgnoreCase(Distribuidores.adistribuidores.get(j).getNombre()))
				//le asignamos el valor del distribuidor al objeto leche
				return distribuidor;
		
	}
}