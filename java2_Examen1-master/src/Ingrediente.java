public class Ingrediente
{
	public String nombreIngrediente;
	public int cantidadGramos;
	public int cantidadUnidad;
	public boolean enGramos;

	
	/*
	public Ingrediente(String nIngrediente, int cGramos, int cUnidad, boolean eGramos)
	{
		nombreIngrediente=nIngrediente;
		cantidadGramos=cGramos;
		cantidadUnidad=cUnidad;
		enGramos=eGramos;
	}
	*/

	//constructor
	public Ingrediente()
	{
		
	}

	//nombre del ingrediente
	public void setNombreIngrediente(String nIngrediente)
	{
		this.nombreIngrediente=nIngrediente;
	}
	public String getNombreIngrediente()
	{
		return nombreIngrediente;
	}


	//gramos o unidades
	public void setEnGramos(boolean eGramos)
	{
		this.enGramos=eGramos;
	}
	public boolean getEnGramos()
	{
		return enGramos;
	}

	//cantidad de gramos
	public void setCantidadGramos(int cGramos)
	{
		this.cantidadGramos=cGramos;
	}
	public int getCantidadGramos()
	{
		return cantidadGramos;
	}

	//cantidad de unidades
	public void setCantidadUnidad(int cUnidad)
	{
		this.cantidadUnidad=cUnidad;
	}
	public int getCantidadUnidad()
	{
		return cantidadUnidad;
	}

	
}