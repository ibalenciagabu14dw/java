import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Cliente 
{

	private String dni;
	private String nombre;
	private String apellidos;
	private Cartilla cartilla;

	//constructor
	public Cliente()
	{
		
	}

	//id del cliente
	public void setDni(String dni)
	{
		this.dni=dni;
	}
	public String getDni()
	{
		return dni;
	}

	//nombre del cliente
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	//apellidos del cliente
	public void setApellidos(String apellidos)
	{
		this.apellidos=apellidos;
	}
	public String getApellidos()
	{
		return apellidos;
	}
	
	//cartilla del cliente
	public void setCartilla(Cartilla cartilla)
	{
		this.cartilla=cartilla;
	}
	public Cartilla getCartilla()
	{
		return cartilla;
	}
	
	//*******************LECTURA DEL FICHERO clientes.txt y guardarlo en un ArrayList*********************
		public void leerclientes() 
		{
			String linea="";
			
			try
			{	
				File archivo = new File ("./clientes.txt");
				FileReader fr = new FileReader (archivo);
				BufferedReader bf = new BufferedReader(fr);
		       	linea = bf.readLine();
				String[] separado = null;//para separar el nombre del clientes, apellidos y arraylist cartilla
				
				System.out.print("\n***********INFORMACION DE LOS CLIENTES*********\n");
				while (linea!=null)
				{     
					separado=linea.split("#");
					System.out.print("\n" + separado[0] + separado[1] + separado[2]);	 			

		 			//leo la proxima linea
					linea = bf.readLine();
				}
				System.out.print("\n******************************************\n");
				bf.close();
			}

			catch(Exception e)
		    {
				System.out.println("Error: "+e);
		    }
		}
		
		public ArrayList<Cliente> cargarClientes() 
		{		
			
			String linea="";
			
			ArrayList <Cliente> aclientes = new ArrayList <Cliente>();
			
			try
			{	
				File archivo = new File ("./potes.txt");
				FileReader fr = new FileReader (archivo);
				BufferedReader bf = new BufferedReader(fr);
		       	linea = bf.readLine();
				String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
				Boolean[]cartillaok = null;
				
				while (linea!=null)
				{     
					//creamos el cliente
					Cliente ocliente = new Cliente();
						 			
		 			//separamos los datos en el array
		 			separado=linea.split(",");

		 			//introducimos los valores en los objetos para despues asignarlos al AarrayList
		 			ocliente.setDni(separado[0]);
		 			ocliente.setNombre(separado[1]);
		 			ocliente.setApellidos(separado[1]);
		 			
		 			//creamos el objeto cartilla
		 			Cartilla ocartilla = new Cartilla();
		 			//ahora separamos la cartilla
		 			String cartilla_junta=separado[3];
					String[] cartilla_separada=cartilla_junta.split("#");//obtener la cartilla
					
					for (int i=0;i<cartilla_separada.length;i++)
					{
						cartillaok[i]=Boolean.parseBoolean(cartilla_separada[i]);
					}
					//asignamos la cartilla al objeto cartilla
					ocartilla.setSellos(cartillaok);
					//asignamos al cliente la cartilla
					ocliente.setCartilla(ocartilla);;
		 			//asignamos al arraylist el cliente
					aclientes.add(ocliente);

		 			//leo la proxima linea
					linea = bf.readLine();
				}
				bf.close();
			}

			catch(Exception e)
		    {
				System.out.println("Error: "+e);
		    }

		    return aclientes;

		}
}