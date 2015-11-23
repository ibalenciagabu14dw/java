public class PintxoPote 
{
	private Cliente cliente;
	private Pintxo pintxo;
	private Pote pote;
	private Double precio;

	//constructor
	public PintxoPote()
	{
		
	}

	//Pintxo del PintxoPote
	public void setPintxo(Pintxo pintxo)
	{
		this.pintxo=pintxo;
	}
	public Pintxo getPintxo()
	{
		return pintxo;
	}

	//Pote del PintxoPote
	public void setPote(Pote pote)
	{
		this.pote=pote;
	}
	public Pote getPote()
	{
		return pote;
	}

	//Precio del PintxoPote
	public void setPrecio(Double precio)
	{
		this.precio=precio;
	}
	public Double getPrecio()
	{
		return precio;
	}
	//Datos del Cliente
		public void setCliente(Cliente cliente)
		{
			this.cliente=cliente;
		}
		public Cliente getCliente()
		{
			return cliente;
		}
}