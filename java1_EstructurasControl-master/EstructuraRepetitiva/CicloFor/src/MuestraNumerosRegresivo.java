
/*
 * programa que muestra los números del 10 al 1
 */
public class MuestraNumerosRegresivo
{
	public static void main(String[] args) 
	{
	//crea la variable i del tipo integer	
        int i;
	//repite el ciclo 10 veces de manera regresiva. Desde i=10, hasta i>0, con el decremento de i-1 cada vez que se ejecuta el bucle
        for(i=10; i>0;i--)
            System.out.println(i + " ");//imprime i
    }
}

