


public class Revista extends Prensa
{
	public int num_revista;
	public String mes;
	//constructor
	Revista()
	{}
	//getter y setter
	public void setNumRevistaIsbn(int num_revista)
	{
		this.num_revista=num_revista;
	}
	public int getNumRevista()
	{
		return num_revista;
	}
	public void setMes(String mes)
	{
		this.mes=mes;
	}
	public String getMes()
	{
		return mes;
	}
	//
	@Override
	public void publicar()
	{
		super.publicar();
		System.out.println("Revista");
	}
}
