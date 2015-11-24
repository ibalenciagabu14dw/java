import java.util.Scanner;

import java.util.ArrayList; 

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;





public class cenaAmigos 
{

	public static void main (String args[]) 
	{
	
		Scanner sc = new Scanner(System.in);
		int num=0;
		String cadena="";
		
		//creamos el ArrayList de Recetas
		ArrayList <Receta> areceta = new ArrayList <Receta>(); 
		//creamos el ArrayList de Ingredientes
		ArrayList <Ingrediente> aingrediente = new ArrayList <Ingrediente>();
		//creamos el bucle para que ejecute las acciones hasta que le diga salir
		do
		{
			System.out.print("\nMENU:");
			System.out.print("\n1.Añadir una nueva receta");
			System.out.print("\n2.Leer recetas");
			System.out.print("\n3.SALIR\n");

			num=sc.nextInt();

			switch (num) 
			{
				case 1:	
				{
				
					//*********************************ARIKETA 1**************************
				
					System.out.println("\nIntroduce el numero de recetas que vas a necesitar: ");

					int n=sc.nextInt();	
					
					for(int i=0;i<n;i++)
					{
								
						//creamos el objeto receta de la clase Receta y le damos los parametros
						Receta oreceta=new Receta();	

						//pedimos el nombre de la receta y lo asignamos
						System.out.println("Introduce el nombre de la receta: ");
						oreceta.setNombreReceta(sc.next());
						

						//pedimos el numero de ingredientes que vamos a utilizar
						System.out.println("Introduce el numero de ingredientes: ");
						int ing=sc.nextInt();
							
						//introducimos los ingredientes
						for (int j=0;j<ing;j++)
						{
							//creamos el objeto ingrediente de la clase Ingrediente y le damos los parametros
							Ingrediente oingrediente = new Ingrediente();
							//pedimos el nombre del ingrediente
							System.out.println("Introduce el nombre del ingrediente: ");
							oingrediente.setNombreIngrediente(sc.next());
							
							do
							{
								//pedimos si vamos a utilizar gramos o unidades
								System.out.println("Gramos o unidades: ");
								cadena=sc.next();
							}while(!cadena.equalsIgnoreCase("gramos") && !cadena.equalsIgnoreCase("unidades"));

							if(cadena.equalsIgnoreCase("gramos"))
							{
								oingrediente.setEnGramos(true);

								//pedimos cantidad de gramos que necesitamos
								System.out.println("Introduce cantidad de gramos: ");
								oingrediente.setCantidadGramos(sc.nextInt());
								
								oingrediente.setCantidadUnidad(-1);
							}

							else 
							{
								oingrediente.setEnGramos(false);
								//pedimos cantidad de unidades necesarias
								System.out.println("\nIntroduce numero de unidades: ");
								oingrediente.setCantidadUnidad(sc.nextInt());
								oingrediente.setCantidadGramos(-1);

							}

						
							//guardamos el ingrediente en el ArrayList
							aingrediente.add(oingrediente);

						}
						//añadimos los ingredientes al objeto receta
						oreceta.setIngredientes(aingrediente);
						//guardamos la preparacion
						System.out.println("\nIntroduce la preparacion: ");
						oreceta.setPreparacion(sc.next());
						
				       	areceta.add(oreceta);

					}
					
				
					//***********************ARIKETA2*************************************

					
					//Crear archivo recetas.txt
					File archivo = new File("/home/ibalenciaga/ProyectosJava/java2_Examen1/src/recetas.txt");
					
					try
					{
						if(archivo.createNewFile())
							System.out.println("\n1");
							System.out.println("\nArchivo creado correctamente");
					}

					catch(IOException ioe)
					{
						System.out.println("\n2");
						System.out.println("Error: "+ioe);
					}

					//Escribir en el fichero separados por comas
					try
					{
						System.out.println("\n3");
						FileWriter fwreceta = new FileWriter(archivo);
						
						//recorremos la receta
						for(int i=0; i<areceta.size(); i++)
						{
							aingrediente = areceta.get(i).getIngredientes();
							fwreceta.write(areceta.get(i).getNombreReceta()+";");
							//recorremos los ingredientes de la receta i uno por uno
							for(int j=0; j<aingrediente.size(); j++)
							{	
								//escribimos los datos del ingrediente de la posicion j
								fwreceta.write(aingrediente.get(j).getNombreIngrediente()+"*");
								fwreceta.write(aingrediente.get(j).getCantidadGramos()+"*");
								fwreceta.write(aingrediente.get(j).getCantidadUnidad()+"*");
								fwreceta.write(aingrediente.get(j).getEnGramos()+"#");
							}
							//por ultimo escribimos la preparacion y saltamos de linea
							fwreceta.write(";"+areceta.get(i).getPreparacion()+"\n");
						}
						//cerramos el archivo
						fwreceta.close();
						
					}
					catch(IOException e)
					{
								System.out.println("\n4");
								System.out.println("Error: "+e);
					}
			
				}
				case 2:
				{
					
					//**********************ARIKETA 3**************************************

					///*
					try
					{
						
				       	//File archivo = new File ("/home/zubiri/ProyectosJava/java2_Examen/src/recetas.txt");
				       	File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Examen1/src/recetas.txt");
				       	
				        	
				       	Scanner linea = new Scanner(archivo);
				        	
				      	if (linea.hasNextLine())
				      		System.out.print("\n****INFORMACION DE LAS RECETAS****\n");
						
						//obtenemos la linea

				 		String concoma = linea.nextLine();
				 		String[] sep1 = null;//las 3 partes de la receta, 0 el nombre, 1 los ingredientes, 2 la preparacion
						String[] sep2 = null;//todos los ingredientes
						String[] sep3 = null;//cada ingrediente
						
						while (linea.hasNextLine())
						{     

				 			//asigno al array los 3 apartados de la fila leida sin comas
							sep1=concoma.split(";");
							System.out.println("\n****************************************************");
							//imprimo el nombre de la receta
							System.out.println("-El nombre de la receta es: " + sep1[0]);
							//separo la parte de todos los ingredientes
							String ingredientes=sep1[1];
							sep2=ingredientes.split("#");
							System.out.println("-los ingredientes necesarios son:");
							
							for(int cant=0;cant<sep2.length;cant++)
							{
								//separo cada ingrediente en partes
								String ingrediente =sep2[cant];
								sep3=ingrediente.split("\\*");
								//imprimo el nombre del ingrediente
								System.out.print(sep3[0] + ", ");
								if(Integer.parseInt(sep3[1])!=-1)
										//imprimo los gramos
										System.out.print(sep3[1] + "gramos\n");
										//imprimo las unidades
								else System.out.print(sep3[2] + "unidades\n");
							}
							//imprimo la preparacion
							System.out.println("-la preparacion es: " + sep1[2]);
							System.out.println("****************************************************");								
							//leo la proxima linea
							concoma = linea.nextLine();
						}
					}

						catch(Exception e)
				    {
				       	e.printStackTrace();
				    }
						
					///*
					break;
				}
				
				case 3:
		    		System.out.println("**************** FIN DEL PROGRAMA **************************");
		    		break;

		    	default:
		    		System.out.println("\nNo has elegido la opcion correcta");
		    
	    	}

		}while (num != 3);

	}

}
						
