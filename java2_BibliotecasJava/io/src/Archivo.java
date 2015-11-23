import java.io.File;
import java.util.Scanner;

public class Archivo 
{
	public static void main (String args[])
	{
		//declaramos las variables
		Scanner lectura=new Scanner(System.in);//crea una variable tipo Scanner para leer el numero introducido
		String ruta;
		//pedimos la ruta
		System.out.println("Introduce la ruta del fichero:");
		ruta=lectura.next(); //guarda en num el valor introducido

		//creamos el objeto fichero y le asignamos la ruta indicada
		File fichero = new File (ruta);

		//si el fichero existe
		if (fichero.exists())
		{
			if (fichero.isFile())
				System.out.println("ES UN FICHERO");
			else System.out.println("\nES UN DIRECTORIO");

			System.out.println("\nNombre del archivo: "+fichero.getName());
        	System.out.println("Camino: "+fichero.getPath());
        	System.out.println("Camino absoluto: "+fichero.getAbsolutePath());
        	System.out.println("Se puede escribir: "+fichero.canRead());
        	System.out.println("Se puede leer: "+fichero.canWrite());
        	System.out.println("Tamaño: "+fichero.length());

		}
	}
}
