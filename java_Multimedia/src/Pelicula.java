

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista artista, int anoEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo,artista,anoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	public Pelicula(Scanner sc) {

		super(sc);
		System.out.println("Productora:");
	    this.setProductora(sc.next());
		System.out.println("Numero de interpretes:");
		for (int i =0;i<sc.nextInt();i++)
		{
			System.out.println("introduce el DNI del interprete:");
			interpretes.add(Artistas.buscarArtista(sc.next()));
		}
		this.setInterpretes(interpretes);
	}
	
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
public String formattedObra() {
		
		String artistaStr = super.formattedObra() + 
				"\n" + "PRODUCTORA:" + this.productora + "\n" +
				"\t" + this.interpretes;
				
		return artistaStr;
	}
}
