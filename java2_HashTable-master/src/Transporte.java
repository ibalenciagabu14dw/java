public class Transporte 
{
	private String matricula;
	private String compania;
	private Double coste;
		
	//constructor
	Transporte()
	{
	}
	//getter y setter
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public String getMatricula()
	{
		return matricula;
	}
	public void setCompania(String compania)
	{
		this.compania=compania;
	}
	public String getCompania()
	{
		return compania;
	}
	public void setCoste(Double coste)
	{
		this.coste=coste;
	}
	public Double getCoste()
	{
		return coste;
	}
	
}