import java.util.Scanner;
import java.lang.String;

public class Imprimir
{
      public static void main(String arg[]) 
	{
            String cadena1, cadena2;

		Scanner sc = new Scanner(System.in);


        System.out.println("introduce la primera palabra:");
		cadena1 = sc.nextLine();
		System.out.println("introduce la segunda palabra:");
		cadena2 = sc.next();

		if ((!cadena1.isEmpty())||(!cadena2.isEmpty()))
		{
			
			
			
			if (cadena1.length()>=3)
			  	System.out.println("La tercera letra de la primera palabra es: " + cadena1.charAt(2));
        	if (cadena2.length()>=3)
        		System.out.println("La tercera letra de la segunda palabra es: " + cadena2.charAt(2));
			

        	if (cadena1.equalsIgnoreCase(cadena2))
        		System.out.println("Las dos palabras son iguales");
        	else
        		System.out.println("Las dos palabras son diferentes");
            
        	System.out.println("Las dos palabras concatenadas forman la palabra: " + cadena1.concat(cadena2));   

			System.out.println("introduce un numero:");
			int num = sc.nextInt();
			System.out.println("el numero es: " + cadena1.valueOf(num));

      }	
 }
}