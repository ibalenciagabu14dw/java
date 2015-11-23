public class Libro extends Prensa 
{
	public int isbn;
	public String editorial;
	public int edicion;
	//constructor
	Libro()
	{}
	//getter y setter
	public void setIsbn(int isbn)
	{
		this.isbn=isbn;
	}
	public int getIsbn()
	{
		return isbn;
	}
	public void setEditorial(String editorial)
	{
		this.editorial=editorial;
	}
	public String getEditorial()
	{
		return editorial;
	}
	public void setEdicion(int edicion)
	{
		this.edicion=edicion;
	}
	public int getEdicion()
	{
		return edicion;
	}
	@Override
	public void publicar()
	{
		super.publicar();
		System.out.println("Libro");
	}
}
