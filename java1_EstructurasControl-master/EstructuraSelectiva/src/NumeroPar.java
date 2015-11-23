
 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class NumeroPar
{
	public static void main(String[] args) 
	{
		//crea la variable sc del tipo scanner
	        Scanner sc = new Scanner(System.in);
		//crea la variable num del tipo integer
	        int num;      
		//pide el numero
	        System.out.println("Introduzca numero: ");
		//introduce en num el valor del teclado
	        num = sc.nextInt();
		//si la condicion (num%2==0)es verdadera, saca PAr, sino IMPAR
	        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}

