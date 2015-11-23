

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*************MENU**************");
			System.out.println("1. Nuevo Alumnos              *");
			System.out.println("2. Nuevo Profesor             *");
			System.out.println("3. Nueva Matricula            *");
			System.out.println("4. Buscar Profesor            *");
			System.out.println("5. Buscar Alumno              *");
			System.out.println("6. Mostrar Profesor           *");
			System.out.println("7. Mostrar Alumno             *");
			System.out.println("0. Salir                      *");
			System.out.println("*******************************");
			opcion = sc.nextInt();
			switch (sc.nextInt()) {
			case 1:
				Personas.crearAlumnos(sc);
				
				break;
			case 2:
				Personas.crearProfesores(sc);
				break;
			case 3:
				Matriculas.crearMatriculas(sc);
				break;
			case 4:
				Personas.buscarProfesor(sc);
				break;
			case 5:
				Personas.buscarAlumno(sc);
				break;
			case 6:
				Personas.formattedAlumnos();
				break;
			case 7:
				Personas.formattedProfesores();
				break;
			
			default:
				if (opcion == 0) {
					break;
				}else{
					System.err.println("No has seleccionado una opcion correcta");
				break;
				}
			}
		}while(opcion != 0);
	}
}
