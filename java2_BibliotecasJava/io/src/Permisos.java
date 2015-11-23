import java.io.FilePermission;
import java.util.Scanner;

public class Permisos
{
	public static void main(String[] args) 
	{
	
	String nombre;
	String ruta;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce la ruta: ");
	ruta = sc.next();
	System.out.print("\nIntroduce el nombre del archivo: ");
	nombre = sc.next();
	
	FilePermission permiso = new FilePermission(ruta.concat(nombre), "read, write" );
	System.out.println(permiso.getActions());
	}

}