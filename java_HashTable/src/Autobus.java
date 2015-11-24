public class Autobus extends Transporte 
{

	//propiedades de la subclase
	public int asientos;
	public String ciudad_salida;
	public String ciudad_destino;
	
	//constructor
	Autobus()
	{
	}
	//getter y setter
		public void setAsientos(int asientos)
		{
			this.asientos=asientos;
		}
		public int getAsientos()
		{
			return asientos;
		}
		public void setCiudadSalida(String ciudad_salida)
		{
			this.ciudad_salida=ciudad_salida;
		}
		public String getCiudadSalida()
		{
			return ciudad_salida;
		}
		public void setCiudadDestino(String ciudad_destino)
		{
			this.ciudad_destino=ciudad_destino;
		}
		public String getCiudadDestino()
		{
			return ciudad_destino;
		}
		
}
