 /*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class NotaCinco{
public static void main( String[] args )
{
	//crea la varaible sc del tipo Scanner
        Scanner sc = new Scanner( System.in );
	//pide la nota por pantalla
        System.out.print("Nota: ");
	//crea la variable nota del tipo integer y le da el valor introducido por el teclado
        int nota = sc.nextInt();
	//si la nota es mayor o igual a 5 muestra los mensajes
        if (nota >= 5 )
	{
        System.out.println("Enorabuena!!");
        System.out.println("Has aprobado");
        }
    }
}
