import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main 
{

	public static void main (String args[]) 
	{
		
		Productos almacen = new Productos();
		//llenamos los Arraylist de Manzanas Lechugas y Leches
		Productos.llenarArraylistProductos();
		
		//****************************MENU********************************
		Scanner sc = new Scanner(System.in);
		String nombre="";
		int eproducto, eleccion=0;
		
		Distribuidores.leerDistribuidores("/home/zubiri/ProyectosJava/java2_Almacen/src/distribuidores.txt");
		Cliente.leerClientes();
		
		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\n1.Mostrar distribuidores");
			System.out.print("\n2.Mostrar clientes");
			System.out.print("\n3.Nuevo producto:");
			System.out.print("\n4.Realizar pedido:");
			System.out.print("\n5.Mostrar ticket compra:");
			System.out.print("\n0.SALIR");			

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");
			eleccion=sc.nextInt();
			switch (eleccion) 
			{
			//mostramos los datos de los distribuidores
				case 1:
				{
					Distribuidores.mostrarDistribuidores();
					break;					
				}

				//mostramos los datos de los clientes
				case 2:
				{
					Cliente.mostrarClientes();
				    break;					
				}

				//nuevo producto
				case 3:
				{
					System.out.println("***************** NUEVO PRODUCTO *************************");
					//Crear archivo productos.txt
					try
					{
						File archivo = new File ("/home/zubiri/ProyectosJava/java2_Almacen/src/productos.txt");
						if(archivo.createNewFile())
							System.out.println("\nArchivo creado correctamente");
					}

					catch(IOException ioe)
					{
						System.out.println("Error: "+ioe);
					}

					do
					{
						System.out.println("\nIntroduce el producto");
						
						System.out.print("\n0.Atras");		
						System.out.print("\n1.Manzana");
						System.out.print("\n2.Lechuga");
						System.out.print("\n3.Leche\n");		
						eproducto=sc.nextInt();
						
						switch (eproducto) 
						{
							//nueva manzana
							case 1:
								{
								Manzana manzana = new Manzana();
								manzana.solicitarDatos();
								manzana.escribirEnFichero();
								break;
							}
							
							//nueva lechuga
							case 2:
							{
								Lechuga lechuga = new Lechuga();
								lechuga.solicitarDatos();
								lechuga.escribirEnFichero();
								break;
							}
							//nueva leche
							case 3:
							{
								Leche leche = new Leche();
								leche.solicitarDatos();
								leche.escribirEnFichero();
								break;
								
							}
							default:
			    					System.out.println("No has elegido la opcion correcta");
			    		}
					
					}while (eproducto!=0);
					
					break;	
				}

				//Realizar pedido
				case 4:
				{
					Cesta.realizarPedido();
					//PRUEBA PARA VER SI LLENA EL ARRAYLIST.....
					for(int i=0; i<Cesta.amanzanaC.size(); i++)
					{	
						System.out.print("\nPRUEBA");
			      		System.out.print("\n" + Cesta.amanzanaC.get(i).getTipo());
			      		System.out.print(Cesta.amanzanaC.get(i).getProcedencia());
			      		System.out.print(Cesta.amanzanaC.get(i).getColor());
			      		System.out.print(Cesta.amanzanaC.get(i).getEurosKilo());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getNombre());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getCif());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getDireccion().getCiudad());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getDireccion().getCalle());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getDireccion().getNumero());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getDireccion().getCodPostal());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getContacto().getNombre());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getContacto().getApellido());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getContacto().getDni());
			      		System.out.print(Cesta.amanzanaC.get(i).getDistribuidor().getContacto().getTelefono());
			      		System.out.print(Cesta.amanzanaC.get(i).getCodBarras());
			      		
			      	}

		    		break;
				}
		    		
				
				//	total del importe
				case 5:
				{	
					Double acum=0.0;
					
					Double desc=0.0;
					//recorremos el ArrayList de clientes para encontrar el introducido
					for(int i=0; i<Cliente.aclientes.size(); i++)
						{
							if (nombre.equalsIgnoreCase(Cliente.aclientes.get(i).getNombre()))
								desc=Cliente.aclientes.get(i).getDescuento();
						}

					System.out.println("**************** TICKET DE LA COMPRA **************************");
					//si hay manzana en la compra se añade
					if (Cesta.amanzanaC.size()!=0)
					{
						//miramos cuantas hay
						for (int i=0;i<Cesta.amanzanaC.size();i++)
						{
							System.out.println("\nproducto: manzana               precio: " + Cesta.amanzanaC.get(i).getEurosKilo());
							acum=acum+Cesta.amanzanaC.get(i).getEurosKilo();
						}
					}
					//si hay lechuga en la compra se añade
					if (Cesta.alechugaC.size()!=0)
					{
						//miramos cuantas hay
						for (int i=0;i<Cesta.alechugaC.size();i++)
						{
							System.out.println("\nproducto: lechuga               precio: " + Cesta.alechugaC.get(i).getEurosUnidad());
							acum=acum+Cesta.alechugaC.get(i).getEurosUnidad();
						}
					}
					//si hay leche en la compra se añade
					if (Cesta.alecheC.size()!=0)
					{
						//miramos cuantas hay
						for (int i=0;i<Cesta.alecheC.size();i++)
						{
							System.out.println("\nproducto: leche                 precio: " + Cesta.alecheC.get(i).getEurosLitro());
							acum=acum+Cesta.alecheC.get(i).getEurosLitro();
						}
					}
					Cesta cesta=new Cesta();
					System.out.println("\n***************************************************************");
					String total3=Double.toString(cesta.total(acum, desc));
					System.out.println("\n                                IMPORTE: " + acum + "€");
					System.out.println("\nCLIENTE: " + nombre + "                  DESCUENTO: " + desc + "€");
					System.out.println("\n                                IMPORTE TOTAL: " + total3 + "€");
					System.out.println("\n***************************************************************");

				}

				//salir del programa
				case 0:
		    		System.out.println("**************** FIN DEL PROGRAMA **************************");
		    		break;
			
				default:
		    		System.out.println("No has elegido la opcion correcta");
		    }

		} while(eleccion != 0);		
		sc.close();

	}
}