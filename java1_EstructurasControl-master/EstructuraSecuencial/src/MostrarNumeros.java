 /* Programa que lea dos números por teclado y los muestre por pantalla.
 */
import java.util.*;
public class MostrarNumeros{
	public static void main(String[] args)
	{
	        //declaracion de variables n1 y n2 del tipo integer
	        int n1, n2;
		//crea la variable sc del tipo Scanner
	        Scanner sc = new Scanner(System.in);
	        //pide el primer numero
	        System.out.println("Introduce un número entero: ");
		//lee un entero por teclado y lo introduce en n1
	        n1 = sc.nextInt();      
	        //pide el segundo numero
	        System.out.println("Introduce otro número entero: ");
		//lee un entero por teclado y lo introduce en n2
	        n2 = sc.nextInt();
       	        //mostrar resultado
	        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
	}
}
