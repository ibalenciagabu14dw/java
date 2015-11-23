/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile 
{
	public static void main(String[] args) 
	{
		//crea la variable n del tipo integer
	        int n;
		//crea la variable sc del tipo Scaner
	        Scanner sc = new Scanner( System.in );
	        do //realiza el bucle
		{
			//pide el numero
		        System.out.print("Escribe un número entre 1 y 10: ");
			//introduce en n el numero introducido por el teclado
		        n = sc.nextInt();
	        }
		while (n<1 || n >10);//hasta que se introduzca un numero entre 0 y 11
		//muestra el numero	
	        System.out.println("Ha introducido: " + n);
	}
}
