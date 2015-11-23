/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class SumaAB
{
	public static void main(String[] args) 
	{
		//crea las variables a y b del tipo integer
	        int a, b;
		//desde a=1,b=1 hasta que a+b sea menor de 10, se incrementa en cada paso a+1 y b+2 
	        for(a = 1, b = 1; a + b < 10; a++, b+=2)
		{
			System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));//imprime los valores de a y b en cada paso y el resultado de su suma
	        }
	}
}
