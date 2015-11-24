import java.util.Scanner;//importa la clase Scanner de la libreria java.util

public class NumeroPar
{
	public static void main(String[] args)
	{
		Scanner lectura=new Scanner(System.in);//crea una variable tipo Scanner para leer el numero introducido
		int num; //creamos la variable num para guardar el valor que introduciremos
		System.out.println("Ingrese el numero:");
		num=lectura.nextInt(); //guarda en num el valor introducido

		if (num%2==0)//comprueba si el numero es par comprobando el resto
			System.out.println("El numero ingresado es par");
		else
			System.out.println("El numero ingresado es impar");
	}
}
