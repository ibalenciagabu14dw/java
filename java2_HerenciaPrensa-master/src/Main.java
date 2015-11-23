public class Main 
{
	public static void main (String [ ] Args) 
	{
		//***LIBRO*****
		//creamos el objeto libro
		Libro libro=new Libro();
		//asignamos valores al libro
		libro.setTitulo("Los pilarres de la tierra");
		libro.setPrecio(13.75);
		libro.setIsbn(1763456);
		libro.setEdicion(27);
		libro.setEditorial("Debolsillo");
		
		libro.publicar();
		//mostramos los datos
		System.out.print("****LIBRO*****");
        System.out.print("\nTITULO: " + libro.getTitulo());
        System.out.print("\nPRECIO: " + libro.getPrecio());
        System.out.print("\nISBN: " + libro.getIsbn());
        System.out.print("\nEDICION: " + libro.getEdicion());
        System.out.print("\nEDITORIAL: " + libro.getEditorial());
                
        //creamos el objeto libro
      	Revista revista=new Revista();
      	//asignamos valores al libro
      	revista.setTitulo("Cocina hoy");
      	revista.setPrecio(13.75);
      	revista.setNumRevistaIsbn(58);
      	revista.setMes("Julio");
      	
      	revista.publicar();
      	//mostramos los datos
      	System.out.print("\n****REVISTA*****");
        System.out.print("\nTITULO: " + revista.getTitulo());
        System.out.print("\nPRECIO: " + revista.getPrecio());
        System.out.print("\nNUMERO: " + revista.getNumRevista());
        System.out.print("\nMES: " + revista.getMes());     
	}
}
