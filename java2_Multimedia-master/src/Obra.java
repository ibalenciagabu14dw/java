import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista artista;
	private int anoEdicion;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int anoEdicion) {
	
		this.titulo = titulo;
		this.artista = autor;
		this.anoEdicion = anoEdicion;
	}
	
	public Obra(Scanner sc) {
		
		System.out.println("titulo de la obra:");
		this.setTitulo(sc.next());
		System.out.println("Artista de la obra:");
		this.setArtista(Artistas.buscarArtista(sc.next()));
		System.out.println("Año de edicion de la obra:");
		this.setAnoEdicion(Integer.parseInt(sc.next()));
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		
		this.artista = artista;
	}

	public int getAnoEdicion() {
		
		return anoEdicion;
	}

	public void setAnoEdicion(int anoEdicion) {
		
		this.anoEdicion = anoEdicion;
	}

	public String formattedObra() {
		String artistaStr = 
				"TITULO:" + this.titulo + "\n" +
				"\t" + this.artista.formattedArtista() + "\n" + 
				"EDICION:" + this.anoEdicion;
				
				return artistaStr;
	}
	
	public void mostrarObra() {
		System.out.println("\tTitulo:" + this.getTitulo());
		System.out.println("\tArtista:" + this.getArtista());
		System.out.println("\tEdicion: " + this.getAnoEdicion());
	}
}