import java.util.ArrayList; 

public class Cuenta
{

	//constructor
	public Cuenta()
	{
		
	}

	//propiedades
	private ArrayList <PintxoPote> cuenta;
	
	//Cuenta del pintxopote
	public void setCuenta(ArrayList <PintxoPote> cuenta)
	{
		this.cuenta=cuenta;
	}
	public ArrayList <PintxoPote> getCuenta()
	{
		return cuenta;
	}

	//metodo imprimir en pantalla
}