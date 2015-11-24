import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public final class Cliente extends Persona
{
	private Direccion direccion;
	private Double num_socio;
	private Double dto;
	
	//nombre del cliente
	static String nombreCliente="";

	//creamos el ArrayList de clientes
	static ArrayList <Cliente> aclientes = new ArrayList <Cliente>();				
	
	//direccion del cliente
	public void setDireccion(Direccion direccion)
	{
		this.direccion=direccion;
	}
	public Direccion getDireccion()
	{
		return direccion;
	}

	//num socio del cliente
	public void setNumSocio(Double num_socio)
	{
		this.num_socio=num_socio;
	}
	public Double getNumSocio()
	{
		return num_socio;
	}

	//descuento del cliente
	public void setDescuento(Double dto)
	{
		this.dto=dto;
	}
	public Double getDescuento()
	{
		return dto;
	}
	
	public static void leerClientes()
	{
		//*******************LECTURA DEL FICHERO clientes.txt y guardarlo en un ArrayList*********************
				try
				{
			       	File archivo = new File ("/home/zubiri/ProyectosJava/java2_Almacen/src/clientes.txt");
			       	FileReader fr = new FileReader (archivo);
					BufferedReader br = new BufferedReader(fr);

			       	String linea = br.readLine();
			      	String[] separado = null;
					
					while (linea!=null)
					{
						//creamos los objetos
						Cliente ocliente=new Cliente();
						Direccion odireccionC=new Direccion();
						
			 			//separamos los datos en el array
			 			separado=linea.split(",");

			 			//introducimos los valores en los objetos para despues añadirlos al ArrayList
			 			//CLIENTE
			 			ocliente.setNombre(separado[0]);
			 			ocliente.setApellido(separado[1]);
			 			ocliente.setDni(separado[2]);
			 			//DIRECCION
			 			odireccionC.setCiudad(separado[3]);
			 			odireccionC.setCalle(separado[4]);
			 			odireccionC.setNumero(Integer.parseInt(separado[5]));
			 			odireccionC.setCodPostal(Integer.parseInt(separado[6]));
			 			//asignamoss el objeto direccion al ArrayList
			 			Direccion.adireccion.add(odireccionC);
			 			ocliente.setDireccion(odireccionC);
			 			
			 			//completamos los datos del cliente con l objetos
						ocliente.setNumSocio(Double.parseDouble(separado[7]));
						ocliente.setDescuento(Double.parseDouble(separado[8]));
						
						//asignamos el objeto cliente al ArrayList
						aclientes.add(ocliente);

			 			//leo la proxima linea
						linea = br.readLine();
					}
					br.close();
				}

				catch(Exception e)
			    {
					System.out.println("Error: "+e);
			    }
	}
	public static void mostrarClientes()
	{
		//mostramos los datos de los clientes
		
		try
		{
			if (Cliente.aclientes!=null)
					System.out.print("\n****INFORMACION DE LOS CLIENTES****\n");

			//recorremos el arraylist
			for(int i=0; i<aclientes.size(); i++)
			{
	      		System.out.print("\n*************************************\n");
				//escribimos los datos del distribuidor de la posicion i
				System.out.println("CLIENTE:" + aclientes.get(i).getNombre());
				System.out.println("APELLIDOS:" + aclientes.get(i).getApellido());
				System.out.println("DNI:" + aclientes.get(i).getDni());
				
				System.out.println("CIUDAD:" + aclientes.get(i).getDireccion().getCiudad());
				System.out.println("CALLE:" + aclientes.get(i).getDireccion().getCalle());
				System.out.println("NUMERO:" + aclientes.get(i).getDireccion().getNumero());
				System.out.println("COD POSTAL:" + aclientes.get(i).getDireccion().getCodPostal());

				System.out.println("SOCIO:" + aclientes.get(i).getNumSocio());
				System.out.println("DESCUENTO:" + aclientes.get(i).getDescuento());
				
			}
			System.out.print("\nFIN DE FICHERO\n");		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}