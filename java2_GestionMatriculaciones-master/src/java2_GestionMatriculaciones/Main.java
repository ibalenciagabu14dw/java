package java2_GestionMatriculaciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Personas.leerPersonas("/home/zubiri/ProyectosJava/java2_GestionMatriculaciones/src/java2_GestionMatriculaciones/personas.txt");
		Asignaturas.leerAsignaturas("/home/zubiri/ProyectosJava/java2_GestionMatriculaciones/src/java2_GestionMatriculaciones/asignaturas.txt");
		Matriculas.leerMatriculas("/home/zubiri/ProyectosJava/java2_GestionMatriculaciones/src/java2_GestionMatriculaciones/matriculas.txt");
		
		int opcion;
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*************MENU**************");
			System.out.println("1. Introducir Persona         *");
			System.out.println("2. Introducir Asignatura      *");
			System.out.println("3. Buscar Alumno              *");
			System.out.println("4. Buscar Profesor            *");
			System.out.println("5. Mostrar Asignaturas        *");
			System.out.println("0. Salir                      *");
			System.out.println("*******************************");
			opcion = sc.nextInt();
			switch (sc.nextInt()) {
			//introducir persona
			case 1:
				new Personas(sc);				
				break;
			//introducir asignatura
			case 2:
				new Asignatura(sc);
				break;
			//buscar alumno
			case 3:
				Personas.obtainAlumno(sc);
				break;
			//buscar profesor
			case 4:
				Personas.obtainProfesor(sc);
				break;
			//mostrar asignaturas
			case 5:
				System.out.print(Asignaturas.formatted());
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
