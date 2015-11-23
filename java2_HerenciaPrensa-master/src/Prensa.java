

public class Prensa {
	public String titulo;
	public Double precio;
	//constructor
	Prensa()
	{}
	//getter y setter
	public void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setPrecio(Double precio)
	{
		this.precio=precio;
	}
	public Double getPrecio()
	{
		return precio;
	}
	
	public void publicar()
	 {		
		System.out.print("\nNueva publicacion: ");
	 }
	
	
}
