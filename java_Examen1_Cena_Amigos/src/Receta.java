import java.util.ArrayList; 


public class Receta
{
	public String nombreReceta;
	public ArrayList <Ingrediente> ingredientes;
	public String preparacion;
	
	/*
	public Receta(String nReceta, ArrayList <Ingrediente> ing, String prep)
	{
		nombreReceta=nReceta;
		ingredientes=ing;
		preparacion=prep;
	}
	*/

	//constructor
	public Receta()
	{

	}


	//nombre de la receta
	public void setNombreReceta(String nReceta)
	{
		this.nombreReceta=nReceta;
	}
	public String getNombreReceta()
	{
		return this.nombreReceta;
	}

	//ingredientes
	public void setIngredientes(ArrayList <Ingrediente> ing)
	{
		this.ingredientes=ing;
	}
	public ArrayList <Ingrediente> getIngredientes()
	{
		return this.ingredientes;
	}

	//Preparacion
	public void setPreparacion(String prep)
	{
		this.preparacion=prep;
	}
	public String getPreparacion()
	{
		return this.preparacion;
	}
}