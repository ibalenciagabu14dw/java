import java.util.Random;
import java.util.Arrays;

public class Aleatorio 
{
	public static void main (String [] args ) 
	{
		  
		int[] notas = new int[5]; 
 		
 		double suma=0; 
 		
		Random numero = new Random ();
		
				
		//Iintroducimos 5 notas aleatorias en el Array
 		for (int num=0;num<5;num++)
 		{
			notas[num]=numero.nextInt();
		}

 		for (int i=0; i<notas.length; i++) 
 		{
 			System.out.println("Nota " + (i+1) + ": " + notas[i]);
			suma+=notas[i];
		} 	
 		
 		System.out.println("La nota media es: " + suma/notas.length);
 		
	}
}