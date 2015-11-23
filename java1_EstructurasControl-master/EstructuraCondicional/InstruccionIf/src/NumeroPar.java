 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class NumeroPar
{
	public static void main(String[] args)
	{
		//crea la varaible sc del tipo Scanner
	        Scanner sc = new Scanner(System.in);
		//crea la variable num del tipo integer
		int num;      
		//pide el numero	        
		System.out.println("Introduzca numero: ");
		//lee el numero y lo introduce en num
	        num = sc.nextInt();
		//si el resto del numero es 0, el numero es par y muestra el mensaje
	        if ((num%2)==0)
			System.out.println("PAR");
		//sino muestra el mensaje de que es impar	
		else
			System.out.println("IMPAR");
	}
}
