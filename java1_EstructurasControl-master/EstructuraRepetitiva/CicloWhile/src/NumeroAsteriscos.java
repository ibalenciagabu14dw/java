
/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class NumeroAsteriscos
{
	public static void main(String[] args) 
	{
		//crea la variable sc del tipo scanner
	        Scanner sc = new Scanner(System.in);
		//crea las variables n y contador del tipo integer, ademas da el valor 0 a contador 
	        int n, contador = 0;
		//pide el numero
	        System.out.print("Introduce un número: ");
		//introduce en n el numero introducido por el teclado
	        n = sc.nextInt();
		//desde contador=0, no sale del bucle hasta que llege al numero introducido, saca un asterisco cada vez que se ejecuta el bucle
	        while (contador < n)
		{
			//imprime el asterisco
 	                System.out.println(" * ");
			//suma 1 a contador
	                contador++;
	        }
	}
}

