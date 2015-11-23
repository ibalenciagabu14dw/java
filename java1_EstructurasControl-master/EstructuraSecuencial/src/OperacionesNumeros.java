
/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;
public class OperacionesNumeros 
{
	public static void main(String[] args)
	{
		//crea la variable sc del tipo Scanner
	        Scanner sc = new Scanner(System.in); 
		//crea las variables numero1 y numero2 del tipo integer
	        double numero1, numero2;
		//pide el primer numero
	        System.out.println("Introduce el primer número:");
		//introduce en numero1 el valor introducido por el teclado
	        numero1 = sc.nextDouble();
		//pide el segundo numero
	        System.out.println("Introduce el segundo número:");
		//introduce en numero2 el valor introducido por el teclado
	        numero2 = sc.nextDouble();
		//muestra los numeros introducidos
	        System.out.println("Números introducido: " + numero1 + "  " + numero2);
		//muestra la suma de los dos numeros
        	System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
		//muestra la resta de los dos numeros
        	System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
		//muestra la multiplicacion de los dos numeros
        	System.out.println(numero1 + " * " + numero2 + " = " + numero1*numero2);
	}
}

