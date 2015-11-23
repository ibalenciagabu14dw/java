import java.util.Scanner;

/*
 *Programa que visualizaaaa en pantalla el resultado 
 * del area y circunferencia de un circulo.
 */
public class OperacionesCirculo {

	public static void main (String args[]) {

		double radio, resul;

		Circulo operaciones = new Circulo();

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio: ");
		radio = sc.nextFloat();
		
		operaciones.setRadio(radio);

		resul = operaciones.area();
		System.out.println("\nEl area  es: " + resul);

		resul = operaciones.circunferencia();
		System.out.println("\nLa circunferencia es: " + resul);

	}
}
