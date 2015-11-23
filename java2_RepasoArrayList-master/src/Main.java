import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.Collections;

public class Main 
{

	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int eleccion, eleccion2;
		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\n1.Ordenar Array");
			System.out.print("\n2.Ordenar ArrayList");
			System.out.print("\n3.Acciones en ArrayList");
			
			System.out.print("\n0.SALIR");			

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

			eleccion=sc.nextInt();	
			
			switch (eleccion) 
			{
				//leer archivo distribuidores
				case 1:
				{

					//declaramos el Array
					int[] lista = {5,1,7,9,6};
					
					System.out.print("lista antes de ordenar:");
					for(int i=0;i<lista.length;i++)
			        {
			        	System.out.print(lista[i] + ",");
			        }
					//Usamos un bucle anidado
			        for(int i=0;i<lista.length;i++)
			        {	
			        	//mira de la posicion i en adelante
			            for(int j=i+1;j<lista.length;j++)
			            {
			                if(lista[i]>lista[j])
			                {
			                    //Intercambiamos valores
			                    int variableauxiliar=lista[i];
			                    lista[i]=lista[j];
			                    lista[j]=variableauxiliar;

			                }
			            }
			        }

			        System.out.print("\nlista despues de ordenar:");
			        for(int i=0;i<lista.length;i++)
			        {
			        	System.out.print(lista[i] + ",");
			        }

			        break;
			    }

			    case 2:
				{
					//declaramos el ArrayList
					ArrayList <Integer> lista = new ArrayList <Integer>();
					lista.add(5);
					lista.add(1);
					lista.add(7);
					lista.add(9);
					lista.add(6);
					
					System.out.print("\nlista antes de ordenar:");
					for(int i=0;i<lista.size();i++)
			        {
			        	System.out.print(lista.get(i) + ",");
			        }
			        
			        Collections.sort(lista);

			        System.out.print("\nlista despues de ordenar:");
					for(int i=0;i<lista.size();i++)
			        {
			        	System.out.print(lista.get(i) + ",");
			        }

					break;
				}


				case 3:
				{
					//declaramos el ArrayList
					ArrayList <String> lista = new ArrayList <String>();
					lista.add("Hola");
					lista.add("Mundo");
					lista.add("Lunes");
					lista.add("Leire");
					lista.add("Balon");
					do
					{
						System.out.print("\n\nSubMENU:");
						System.out.print("\n1.Introducir dato");
						System.out.print("\n2.Modificar dato");
						System.out.print("\n3.Eliminar dato");
						System.out.print("\n4.Buscar dato");
						System.out.print("\n5.Mostrar datos");
						
						System.out.print("\n0.ATRAS");			

						System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

						eleccion2=sc.nextInt();	
						
						switch (eleccion2) 
						{
							//leer archivo distribuidores
							case 1:
							{
								System.out.println("\nIntroduce el nuevo dato: ");
								lista.add(sc.next());
								break;
							}

							case 2:
							{
								
								for(int i=0;i<lista.size();i++)
							        {
							        	System.out.print("\n" + (i+1) +"."+ lista.get(i));
							        }
							        System.out.print("\nElige la posicion del dato que quieres cambiar: ");
							        eleccion=sc.nextInt();
							        System.out.println("\nIntroduce el nuevo dato: ");
									lista.set(eleccion-1, sc.next());
								break;
							}

							case 3:
							{	
								System.out.print("\nElementos en el ArrayList: ");
								for(int i=0;i<lista.size();i++)
							    {
							       	System.out.print("\n" + (i+1) +"."+ lista.get(i));
							    }
							    
							    System.out.print("\nElige la posicion del dato que quieres borrar: ");
							    lista.remove(sc.nextInt()-1);
							    System.out.println("\nDato borrado");
								
								break;
							}

							case 4:
							{
								System.out.print("\nIntroduce la palabra que quieres buscar: ");
								String cadena=sc.next();
							    for(int i=0;i<lista.size();i++)
							    {
							       	if(lista.contains(cadena));
							       		System.out.print("\nla palabra introducida esta en la posicion: " + (i+1));
							    }
								break;
							}

							case 5:
							{
								System.out.print("\npalabras que contiene el ArrayList: ");
								for(int i=0;i<lista.size();i++)
							    {
							       	System.out.print("\n" + (i+1) + "." + lista.get(i));
							    }
								
								break;
							}

							case 0: 
								break;
							
							default: System.out.print("\nNo has introducido una opcion correcta");
						}
					}while(eleccion2!=0);

					break;
				}

				case 0:
					break;

				default: System.out.print("\nNo has introducido una opcion correcta\n");
			}
		}while(eleccion!=0);

    }
}