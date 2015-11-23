import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList; 
import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) 
	{
		//************************************** MENU ********************************************
		do
		{
			System.out.println("\nMENU:");
			System.out.println("1.Nuevo habitante");
			System.out.println("2.Nuevo ayuntamiento");
			System.out.println("3.Nuevo partido politico");
			System.out.println("4.Leer Ayuntamientos");
			System.out.println("5.Leer lista de partidos politicos");
			System.out.println("6.Leer lista de censo");
			
			System.out.println("0.SALIR");

			System.out.println("Introduce el numero de la accion que quieres realizar: ");

			System.out.println("***********************************************");
			
			switch (sc.nextInt()) 
			{
				//crear nuevo Habitante y guardarlo en censo.txt
				case 1:
				{
					Habitante.nuevoHabitante();
					break;
				}
				//crear nuevo ayuntamiento y guardarlo en ayuntamiento.txt
				case 2:
				{
					Ayuntamiento.NuevoAyuntamiento();
					break;				
				}
				//crear nuevo partido y guardarlo en listadoPartidos.txt 
				case 3:
				{
					Partido.nuevoPartido();					
					break;
				}
				//LEER fichero ayuntamiento.txt y mostrar por pantalla
				case 4:
				{
					Ayuntamiento ayuntamiento = new Ayuntamiento();
					ayuntamiento.mostrar();
					break;
				}
				//LEER fichero listadoPartidos.txt y mostrar por pantalla 
				case 5:
				{
					Partido.leerPartido();						
					break;
				}
				//LEER fichero censo.txt y GUARDAR en ARRAYLIST. IMPRIMIR SOLO MAYORES DE 18
				case 6:
				{
					String linea="";
		        	int cont=0;
		    		try
		    		{	
		    			File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/censo.txt");
		    			//File archivo = new File ("./censo.txt");
		    			FileReader fr = new FileReader (archivo);
		    			BufferedReader bf = new BufferedReader(fr);
		    	       	linea = bf.readLine();
		    			String[] separado = null;//para separar las diferentes propiedades del partido
		    			//Creamos el objeto Arraylist del tipo habitante
			        	ArrayList <Habitante> ahabitante = new ArrayList <Habitante>() ;
		    			while (linea!=null)
		    			{
		    				separado=linea.split(",");
		    				Habitante ohabitante = new Habitante();
		    				//asigno los datos al objeto
		    				ohabitante.setNombre(separado[0]);
		    				ohabitante.setApellido(separado[1]);
		    				ohabitante.setDni(separado[2]);
		    				ohabitante.setEdad(Integer.parseInt(separado[3]));
		    				ohabitante.setSexo(separado[4]);
		    				ohabitante.setTelefono(Integer.parseInt(separado[5]));
		    				ohabitante.setPoblacion(separado[6]);
		    				//asigno el nuevo habitante al arraylist
		    				ahabitante.add(ohabitante);
		    	 			//leo la proxima linea
		    				linea = bf.readLine();
		    				if (Integer.parseInt(separado[3])>=18)
		    				{
		    					cont++;
		    				}
		    			}
		    			System.out.print("\n***********INFORMACION DE LOS HABITANTES*********\n");
		    			for (int i=0;i<ahabitante.size();i++)
		    			{
		    				System.out.println("NOMBRE: " + ahabitante.get(i).getNombre());
		    				System.out.println("APELLIDOS: " + ahabitante.get(i).getApellido());
		    				System.out.println("DNI: " + ahabitante.get(i).getDni());
		    				System.out.println("EDAD: " + ahabitante.get(i).getEdad());
		    				System.out.println("SEXO: " + ahabitante.get(i).getSexo());
		    				System.out.println("TELEFONO: " + ahabitante.get(i).getTelefono());
		    				System.out.println("POBLACION: " + ahabitante.get(i).getPoblacion());
		    				System.out.println("******************************************");
		    			}
		    			System.out.println("***********INFORMACION DEL CENSO*********");
		    			System.out.println("Total de habitantes en el archivo: " + ahabitante.size()) ;
						System.out.println("Habitantes mayores de 18 años: " + cont) ;
						System.out.println("****************************************************************");								

						//vaciamos los ArryList
						ahabitante.clear();
						
						System.out.println("despues del vaciado del arraylist HABITANTE: " + ahabitante.size() + " elementos") ;
						System.out.println("****************************************************************");
						
		    			System.out.println("******************************************");
		    			bf.close();
		    		}

		    		catch(Exception e)
		    	    {
		    			System.out.println("Error: "+e);
		    	    }
		    		
		    		break;
					
		    	}
				//salir del programa
		    	case 0:
		    		System.out.println("**************** FIN DEL PROGRAMA **************************");
		    		break;

		    	default:
		    		System.out.println("No has elegido la opcion correcta");
		    }
	    
	    }while(sc.nextInt() != 0);
	}
}