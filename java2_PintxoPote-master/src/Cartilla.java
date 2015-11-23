public class Cartilla 
{

	private Boolean[] sellos;
	

	//constructor
	public Cartilla()
	{
		
	}

	//id del cliente
	public void setSellos(Boolean[] sellos)
	{
		this.sellos=sellos;
	}
	public Boolean[] getSellos()
	{
		return sellos;
	}
 
	//metodo sellar() cambiar a true los sellos
	public void sellar(int i)
	{
		sellos[i]=true;
	}

	//metodo devolver descuento correspondiente
}