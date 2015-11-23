public class Taxi extends Transporte 
{

	//propiedades de la subclase
	public int licencia;
	public int antiguedad;
	
	//constructor
	Taxi()
	{
	}
	//getter y setter
	public void setLicencia(int licencia)
	{
		this.licencia=licencia;
	}
	public int getLicencia()
	{
		return licencia;
	}
	public void setAntiguedad(int antiguedad)
	{
		this.antiguedad=antiguedad;
	}
	public int getAntiguedad()
	{
		return antiguedad;
	}
}
