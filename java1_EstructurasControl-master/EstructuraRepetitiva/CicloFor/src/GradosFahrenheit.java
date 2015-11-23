
/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class GradosFahrenheit 
{
	public static void main(String[] args) 
	{
		//crea la constante final del tipo integer valor_inicial
	        final int VALOR_INICIAL = 10; // limite inf. tabla
		//crea la constante final del tipo integer valor_final
	        final int VALOR_FINAL = 100; // limite sup. tabla
		//crea la constante final del tipo integer paso dandole el valor 10
	        final int PASO = 10 ; // incremento
		//crea la variable fahrenheit del tipo integer
	        int fahrenheit;
		//crea la variable celsius del tipo double
	        double celsius;
		//da el valor de 10 a fahrenheit
	        fahrenheit = VALOR_INICIAL;
		//imprime la cabecera
	        System.out.printf("Fahrenheit \t Celsius \n");
		//realiza el bucle desde el valor inicial hasta el valor final	
	        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) //suma 10 al valor de fahrenheit en cada ejecucion del bucle
		{
			//calcula celsius y lo introduce en celsius
			celsius = 5*(fahrenheit - 32)/9.0;
			//imprime los valores de celsius y fahrenheit		 
	        	System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		}
	}
}

