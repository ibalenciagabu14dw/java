
/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class SaludoHora
{
	public static void main(String[] args)
	{
		//crea la variable sc del tipo Scanner		
		Scanner sc = new Scanner(System.in);
		//crea la variable hora del tipo integer
		int hora;
		//pide la hora		
		System.out.println("Introduzca una hora (un valor entero): ");
		//introduce la hora en hora
		hora = sc.nextInt();
		//si la hora esta entre las 0 y 12 horas muestra el mensaje	
		if (hora >= 0 && hora < 12)
			System.out.println("Buenos días");
		//sino, si la hora esta entre las 12 y las 21 horas muestra este mensaje
		else if (hora >= 12 && hora < 21)
			System.out.println("Buenas tardes");
		//sino, si la hora esta entre las 21 y las 24 horas muestra este mensaje
		else if (hora >= 21 && hora < 24)
			System.out.println("Buenas noches");
		//sino muestra este mensaje de hora no valida	
		else
			System.out.println("Hora no válida");
	}
}

