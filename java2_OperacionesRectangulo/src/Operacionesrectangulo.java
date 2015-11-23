import java.util.Scanner;

/*
 *Programa que visualizaaaa en pantalla el resultado 
 * del area y circunferencia de un circulo.
 */
public class Operacionesrectangulo {

	public static void main (String args[]) {

		double num;

		Rectangulo operaciones = new Rectangulo();

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la base: ");
		num = sc.nextDouble();
		
		operaciones.setBase(num);

		System.out.print("\ningresa la altura: ");
		num = sc.nextDouble();
		
		operaciones.setAltura(num);

		num = operaciones.area();
		System.out.println("\nEl area  es: " + num);

		num = operaciones.perimetro();
		System.out.println("\nEl perimetro es: " + num);

	}
}
