 /*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class ImprimePotencias
{
	public static void main(String[] args) 
	{
		//crea la variable constante XMAX del tipo int, es final para que no se le pueda cambiar el valor.
	        final int XMAX = 10;
		//crea las variables x y n del tipo integer
        	int x, n;
        	//mostrar la cabecera de la tabla
        	System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
        	for (x = 1; x <= XMAX; x++)
		{   //filas
			for (n = 1; n <= 4; n++)
			{   //columnas
		                System.out.printf("%10.0f", Math.pow(x,n));//imprime una fila desde la columna 1 hasta la 4.Va desde la fila 1 hasta XMAX, en este cao 10. Imprime la potencia de n al numero x
       			}
		        System.out.println();//Cuando termina de imprimir la linea, cambia de linea
		}
	}
}
