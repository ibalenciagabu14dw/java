import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones;
	
	public Disco(String titulo, Artista artista, int anoEdicion, String discografica, int nCanciones) {
		super(titulo,artista,anoEdicion);
		this.discografica = discografica;
		this.nCanciones = nCanciones;
	}
	
	public Disco(Scanner sc) {

		super(sc);
		System.out.println("Discografica:");
	    this.setDiscografica(sc.next());
		System.out.println("Numero de canciones:");
	    this.setnCanciones(Integer.parseInt(sc.next()));
		
	}
	
	public String getDiscografica() {
		
		return discografica;
	}
	
	public void setDiscografica(String discografica) {
		
		this.discografica = discografica;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	@Override
	public String formattedObra() {
		
		String artistaStr = super.formattedObra() + 
				"\n" + "DISCOGRAFICA:" + this.discografica + "\n" +
				"NUMERO de CANCIONES" + this.nCanciones;
				
		return artistaStr;
	}
}
