public abstract class Producto {
	private String tipo;
	private String procedencia;
	private Distribuidor distribuidor;
	private int cod_barras;
	
	//tipo
	public void setTipo(String tipo)
	{
		this.tipo=tipo;
	}
	public String getTipo()
	{
		return tipo;
	}

	//Procedencia
	public void setProcedencia(String procedencia)
	{
		this.procedencia=procedencia;
	}
	public String getProcedencia()
	{
		return procedencia;
	}
	
	//distribuidor
	public void setDistribuidor(Distribuidor distribuidor)
	{
		this.distribuidor=distribuidor;
	}
	public Distribuidor getDistribuidor()
	{
		return distribuidor;
	}

	//Codigo de barras
	public void setCodBarras(int cod_barras)
	{
		this.cod_barras=cod_barras;
	}
	public int getCodBarras()
	{
		return cod_barras;
	}
		
	abstract void solicitarDatos();
	abstract void escribirEnFichero();	
}
