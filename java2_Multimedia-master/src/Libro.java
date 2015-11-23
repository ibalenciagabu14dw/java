import java.util.Scanner;



public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista artista, int anoEdicion, String editorial, int numPaginas) {
		super(titulo,artista,anoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	public Libro(Scanner sc) {

		super(sc);
		System.out.println("Editorial:");
	    this.setEditorial(sc.next());
		System.out.println("Numero de paginas del libro:");
	    this.setNumPaginas(Integer.parseInt(sc.next()));
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String formattedObra() {
		
		String artistaStr = super.formattedObra() + 
				"\n" + "EDITORIAL:" + this.editorial + "\n" +
				"NUMERO de PAGINAS" + this.numPaginas;
				
		return artistaStr;
	}

}
