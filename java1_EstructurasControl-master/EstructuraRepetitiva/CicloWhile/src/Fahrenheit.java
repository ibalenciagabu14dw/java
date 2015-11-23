 /*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Fahrenheit
{
	public static void main(String[] args) 
	{
		//da limite de valores a la tabla
		//crea la constante final valor_inicial del tipo integer. Le da el valor de 10
	        final int VALOR_INICIAL = 10;  // limite inf. tabla
		//crea la constante final valor_final del tipo integer. Le da el valor de 100
	        final int VALOR_FINAL = 100;  // limite sup. tabla
		//crea la constante final paso del tipo integer. Le da el valor de 10
		final int PASO = 10 ; // incremento
		//crea la variable fahrenheit del tipo integer
	        int fahrenheit;
		//crea la variable celsius del tipo double
	        double celsius;
		//da el valor de valor_inicial a fahrenheit, 10
	        fahrenheit = VALOR_INICIAL; 
		//muestra la cabecera
	        System.out.printf("Fahrenheit \t Celsius \n");
		//muestra los valores hasta que llege al valor final
	        while (fahrenheit <= VALOR_FINAL )
		{
			//calcula el celsius y lo introduce en celsius
	        	celsius = 5*(fahrenheit - 32)/9.0;
			//muestra los valores		
	                System.out.printf("%7d \t %8.3f \n", fahrenheit,	celsius);
			//incrementa en 10 el fahrenheit
	                fahrenheit += PASO;
		}
	}
}
