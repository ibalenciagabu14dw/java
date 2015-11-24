 import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Artistas {

	private static ArrayList<Artista> listaArtistas = new ArrayList<Artista>();
	
	public static void leerArtistas(String fichero) throws IOException {
		String linea;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No existen artistas en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Artista artista = new Artista(linea,",");
			listaArtistas.add(artista);
			linea = br.readLine();
		}
		br.close();
	}
	
	 public static Artista buscarArtista(String dni) {
			
		int i = 0;
		Artista artista = null;

		do {		
			if (listaArtistas.get(i).getDni().equalsIgnoreCase(dni)) {
				artista = (Artista)listaArtistas.get(i);
			}
			i++;
		} while ((artista == null) && (i < listaArtistas.size()));
			
		if (artista == null) {
			System.out.println("Artista no encontrado. Se cierra el programa.");
			System.exit(-1);
		}
		
		return artista;
	}
	 
	 public static void mostrarArtistas() {
		
		if (listaArtistas.size() == 0) {
			System.out.println("No se han cargado los artistas");
		}
		for (int i = 0;i < listaArtistas.size();i++) {
			System.out.println(listaArtistas.get(i).formattedArtista());
		}
	}
	 
	 public String formattedartistas() {
			
		 String artistaStr = "";
		 for (int i=0;i<listaArtistas.size();i++)
			 {
			 artistaStr = listaArtistas.get(i).formattedArtista();
			 }
		  
					return artistaStr;
		}
}
