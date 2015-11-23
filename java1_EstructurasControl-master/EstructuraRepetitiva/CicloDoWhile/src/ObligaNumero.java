 /*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class ObligaNumero
{
	public static void main(String[] args) 
	{
		//crea la variable valor del tipo integer
	        int valor;
		//crea la variable sc del tipo Scanner
	        Scanner in = new Scanner( System.in );
		//no saldra del bucle hasta que se introduzca un numero menor que 100
	        do
		{
			//pide un numero por pantalla
			System.out.print("Escribe un entero < 100: ");
			//introduce en valor el numero introducido por el teclado
			valor = in.nextInt();
	        }
		while (valor >= 100);
		//muestra el ultimo numero introducido
	        System.out.println("Ha introducido: " + valor);
	}
}
