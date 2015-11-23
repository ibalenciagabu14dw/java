import java.util.Scanner;
import java.util.ArrayList; 
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main 
{

	public static void main (String args[]) 
	{
		
		ArrayList <Bar> abar = new ArrayList <Bar>();
		ArrayList <Pintxo> apintxo = new ArrayList <Pintxo>();
		ArrayList <Pote> apote = new ArrayList <Pote>();
		ArrayList <Cliente> acliente = new ArrayList <Cliente>();
		ArrayList <Cuenta> acuenta = new ArrayList <Cuenta>();
		

		Scanner sc = new Scanner(System.in);
		int eleccion=0;
		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\n1.Lectura de PINTXOS");
			System.out.print("\n2.Lectura de POTES");
			System.out.print("\n3.Lectura de BARES:");
			System.out.print("\n4.Pedir ronda:");
			System.out.print("\n5.Realizar cuenta:");
			System.out.print("\n0.SALIR");			

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

			eleccion=sc.nextInt();	
			
			switch (eleccion) 
			{
				//leer archivo pintxos.txt
				case 1:
				{
					Pintxo pintxo=new Pintxo();
					pintxo.leerPintxos();
					break;
				}
				//leer archivo potes.txt
				case 2:
				{
					Pote pote=new Pote();
					pote.leerPotes();					
					break;
				}
				//leer archivo bares.txt
				case 3:
				{
					Bar bar=new Bar();
					bar.leerBares();					
					break;
				}
				//Pedir ronda de pintxopote
				case 4:
				{
					//variable para saber el numero de pintxopotes que se van a tomar
					int contador=0;
					Cliente cliente = new Cliente();
					//cargamos el arraylist clientes leyendo el fichero clientes.txt
					acliente=cliente.cargarClientes();
					Bar bar=new Bar();
					//mostramos los bares 
					bar.leerBares();
					System.out.println("\nIndica en que bar te encuentras: ");
					int opcion=sc.nextInt();
					System.out.println("\nCuantos PintxoPotes vais a tomar: ");
					contador =sc.nextInt();
					for (int i=0;i<=contador;i++)
					{
						System.out.println("\nIntroduce el nombre del cliente: ");
						String nombre=sc.next();
						Boolean existe=false;
						//recorremos el arraylist cliente para ver si el cliente existe
						for (int j=0;j<acliente.size();j++)
						{
							if (nombre.equalsIgnoreCase(acliente.get(j).getNombre()))
								existe=true;
						}
						//si el cliente no existe se crea uno nuevo en el fichero y se asigna al arraylist cliente
						if (!existe)
						{
							System.out.println("\nEl cliente introducido no existe, vamos a crearlo...");
							
							File clientestxt = new File("./clientes.txt");
							try
							{
								//si el archivo no existe lo creamos
								if(clientestxt.createNewFile())
									System.out.println("\nArchivo creado correctamente");
							}
							catch(IOException ioe)
							{
								System.out.println("Error: "+ioe);
							}

							try
							{
								FileWriter fwclientes = new FileWriter(clientestxt, true);
								
								System.out.println("Introduce el DNI del nuevo cliente: ");
								fwclientes.write(sc.next() + ",");
								System.out.println("Introduce el NOMBRE del nuevo cliente: ");
								fwclientes.write(sc.next() + ",");
								System.out.println("Introduce los APELLIDOS del nuevo cliente: ");
								fwclientes.write(sc.next() + ",");
								for (int j=0;j<10;j++)
								{
									fwclientes.write("false");
									//escribimos la almoadilla si no es la decima posicion
									if (j!=9)
										fwclientes.write("#");
								}
								fwclientes.close();
							}
							catch(IOException e)
							{
								System.out.println("Error: "+e);
							}
						}
						//mostramos los pintxos del bar
						abar=bar.cargarBares();
						
					}
					//
					/*
					//cargamos el ArrayList de PINTXOS
					Pintxo pintxo=new Pintxo();
					apintxo=pintxo.cargarPintxos(apintxo);
					//cargamos el ArrayList de POTES
					Pote pote=new Pote();
					apote=pote.cargarPotes(apote);
					

					//cargamos el ArrayList de BARES
					Bar bar=new Bar();
					abar=bar.cargarBares();

					
					*/
					Cliente ocliente=new Cliente();
					cliente.leerclientes();;			
					break;
					
				
				}
				//Realizar la cuenta de la ronda
				case 5:
				{
					break;
				}
				//Salir
				case 0:
				{
					break;
				}
				default: 
					System.out.println("\nOpcion incorrecta");
			}
		}while(eleccion!=0);
	}
}