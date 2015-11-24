import java.util.Scanner;
import java.util.Arrays;

public class NotaMedia 
{
	public static void main (String [] args ) 
	{
		  
		int[] notas = new int[5]; 
 		String resp;
 		double suma=0; 
 		
		Scanner lectura=new Scanner(System.in);
		
		//Iintroducimos 5 notas en el Array
 		for (int num=0;num<5;num++)
 		{
 			System.out.println("Introduce la nota:" + (num+1));
 			resp=lectura.next(); 	
 			//parseInt es para convertir el String en int
 			notas[num]=Integer.parseInt(resp);

 			
 		}

 		for (int i=0; i<notas.length; i++) 
 		{
 			System.out.println("Nota " + (i+1) + ": " + notas[i]);
			suma+=notas[i];
		} 	
 		
 		System.out.println("La nota media es: " + suma/notas.length);
 		
	}
}