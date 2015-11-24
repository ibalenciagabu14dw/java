import java.util.ArrayList;

public class Direccion
{
	private String ciudad;
	private String calle;
	private int numero;
	private int codPostal;
	
	//creamos el ArrayList de direccion
	static ArrayList <Direccion> adireccion = new ArrayList <Direccion>();
	
	//nombre de la ciudad
	public void setCiudad(String ciudad)
	{
		this.ciudad=ciudad;
	}
	public String getCiudad()
	{
		return ciudad;
	}

	//Nombre de la calle
	public void setCalle(String calle)
	{
		this.calle=calle;
	}
	public String getCalle()
	{
		return calle;
	}

	//numero de la calle
	public void setNumero(int numero)
	{
		this.numero=numero;
	}
	public int getNumero()
	{
		return numero;
	}

	//codigo postal de la calle
	public void setCodPostal(int codpostal)
	{
		this.codPostal=codpostal;
	}
	public int getCodPostal()
	{
		return codPostal;
	}
}