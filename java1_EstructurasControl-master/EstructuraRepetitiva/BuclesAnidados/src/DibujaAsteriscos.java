 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;
public class DibujaAsteriscos 
{
	public static void main(String[] args) 
	{
	        //crea la variable sc del tipo Scanner
		Scanner sc = new Scanner(System.in);
		//crea las variables filas y columnas del tipo integer
	        int filas, columnas;

	        //leer número de filas hasta que sea un número > 0
	        do
		{
			//pide numero de filas			
			System.out.print("Introduce número de filas: ");
			//introduce en filas el valor introducido por teclado
			filas = sc.nextInt();
		}
		while(filas<1);//no sale del bucle hasta que se introduzca un numero mayor que 0

	        //leer número de columnas hasta que sea un número > 0
	        do
		{
			//pide el numero de columnas		        
			System.out.print("Introduce número de columnas: ");
			//introduce en columnas el valor introducido por el teclado
        		columnas = sc.nextInt();
	        }
		while(columnas<1);//no sale del bucle hasta que se introduzca un numero mayor que 0
	        
		for(int i = 1; i<=filas; i++)//desde i=1 hasta numero de filas introducido
		{    //filas
		        for(int j = 1; j<=columnas; j++)//desde j=1 hasta numero de columnas introducido
			{   //columnas
        		        System.out.print(" * ");//imprime los asteriscos de todas las columnas de una misma fila
		        }
		        System.out.println();//pasa a la siguiete fila
        	}
       
	}    
}
