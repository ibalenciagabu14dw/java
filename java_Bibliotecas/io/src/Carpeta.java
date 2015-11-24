import java.io.File;
import java.util.Scanner;

public class Carpeta 
{
	public static void main (String args[])
	{
		//declaramos las variables
		Scanner lectura=new Scanner(System.in);//crea una variable tipo Scanner para leer el numero introducido
		String ruta;
		//pedimos la ruta
		System.out.println("Introduce la ruta del directorio:");
		ruta=lectura.next(); //guarda en num el valor introducido

		//creamos el objeto fichero y le asignamos la ruta indicada
		File carpeta = new File (ruta);


		if (carpeta.isDirectory())
		{
        	String[] listaArchivos=carpeta.list();
        	for(int i=0; i<listaArchivos.length; i++)
        	{
            System.out.println(listaArchivos[i]);
        	}
		}
		else System.out.println("ERROR, ES UN ARCHIVO");
	}
}
 