 /*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class SumaNumero
{
	public static void main(String[] args) 
	{
		//crea las variables suma y num del tipo integer. da el valor 0 a suma
	        int suma = 0, num;
		//crea la variable sc del tipo Scanner
	        Scanner sc = new Scanner(System.in);
		//pide el numero
	        System.out.print("Introduzca un número: ");
		//introduce en num el valor introducido por el teclado
	        num = sc.nextInt();
		//repite el bucle hasta que se introduzca un numero menor que 0
	        while (num >= 0)
		{
			//va acumulando la suma de los numeros introducidos
	                suma = suma + num;
			//pide el numero	
	                System.out.print("Introduzca un número: ");
			//introduce en num el numero introducido
	                num = sc.nextInt();
	        }
		//muestra el resultado de la suma de los numeros acumulados
	        System.out.println("La suma es: " + suma );
	}
}
