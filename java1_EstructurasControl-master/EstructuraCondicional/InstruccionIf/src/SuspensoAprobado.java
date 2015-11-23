 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class SuspensoAprobado
{
	public static void main( String[] args )
	{
		//crea la variable sc del tipo Scanner
		Scanner sc = new Scanner( System.in );
		//pide la nota        
		System.out.print("Nota: ");
		//crea la variable nota del tipo integer y le da el valor introducido por el teclado
	        int nota = sc.nextInt();
		//si la nota es igual o mayor que 5 saca los dos mensajes
	        if (nota >= 5 )
		{
	            System.out.println("Enorabuena!!");
	            System.out.println("Has aprobado");
	        }
		//sino muestra el otro mensaje        
		else
		System.out.println("Lo Siento, has suspendido");
	}
}
