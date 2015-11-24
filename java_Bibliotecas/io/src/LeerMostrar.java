import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerMostrar
{
	public static void main( String[] args )
	{
		BufferedReader leer = new BufferedReader(new InputStreamReader( System.in ));
		String nombre="";
		System.out.print("Escribe tu nombre:");
		try
		{
			nombre = leer.readLine();//lee la linea introducida
		}
		catch( IOException e )
		{
			System.out.println("Error");
		}
		System.out.println("Hola " + nombre );
	}
}
