
/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
//importa todas las clases del paquete java.util
import java.util.*;
public class CalificacionNota
{
	public static void main(String[] args)
	{
	//crea la variable sc del tipo Scanner	
	Scanner sc = new Scanner(System.in);
	//crea la variable nota del tipo double
	double nota;
	//pide la nota
	System.out.println("Introduzca una nota entre 0 y 10: ");
	//introduce el valor del teclado en nota
	nota = sc.nextDouble();
	//muestra este mensaje
	System.out.println("La calificación del alumno es ");
	//mira si la nota introducida es valida, si no lo es, saca el mensaje
	if(nota < 0 || nota > 10)
	System.out.println("Nota no válida");
	//sino, si la nota es 10 saca el mensaje
	else if(nota==10)
		System.out.println("Matrícula de Honor");
	//sino, si la nota es 9 o mayor muestra este mensaje	
	else if (nota >= 9)
		System.out.println("Sobresaliente");
	//sino, si la nota es mayor de 7 saca el mensaje	
	else if (nota >= 7)
		System.out.println("Notable");
	//sino, si la nota es igual o mayor que 6 saca el mensaje
	else if (nota >= 6)
        	System.out.println("Bien");
	//sino, si la nota es mayor o igual a 5 saca el mensaje
	else if (nota >= 5)
		System.out.println("Suficiente");
	//sino muestra el mensaje de suspenso
	else
		System.out.println("Suspenso");
	}
}

