
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Distribuidores {
	//creamos el ArrayList de direccion
	static ArrayList <Distribuidor> adistribuidores = new ArrayList <Distribuidor>();
		
	public static void leerDistribuidores(String archivo)
	{
		//*******************LECTURA DEL FICHERO distribuidores.txt y guardarlo en un ArrayList*********************
		try
		{	
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
	       	String linea = br.readLine();
			String[] separado = null;
			String[] separado2=null; 
			
			while (linea!=null)
			{     
				//creamos los objetos
				Distribuidor odistribuidor=new Distribuidor();
				Direccion odireccionD=new Direccion();
				Contacto ocontacto=new Contacto();
	 			
	 			//separamos los datos en el array
	 			separado=linea.split(",");

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			//DISTRIBUIDOR
	 			odistribuidor.setNombre(separado[0]);
	 			odistribuidor.setCif(separado[1]);
	 			//separamos la direccion
	 			separado2=separado[2].split("#");
	 			//DIRECCION
	 			odireccionD.setCiudad(separado2[0]);
	 			odireccionD.setCalle(separado2[1]);
	 			odireccionD.setNumero(Integer.parseInt(separado2[2]));
	 			odireccionD.setCodPostal(Integer.parseInt(separado2[3]));
	 			//asignamos el objeto direccion al ArrayList
	 			Direccion.adireccion.add(odireccionD);
	 			//separamos el contacto
	 			separado2=separado[3].split("#");
	 			//CONTACTO
	 			ocontacto.setNombre(separado2[0]);
	 			ocontacto.setApellido(separado2[1]);
	 			ocontacto.setDni(separado2[2]);
	 			ocontacto.setTelefono(Integer.parseInt(separado2[3]));
	 			//asignamos el objeto contacto al ArrayList
	 			Contacto.acontactos.add(ocontacto);
	 			//completamos los datos del distribuidor con los objetos
				odistribuidor.setDireccion(odireccionD);
				odistribuidor.setContacto(ocontacto);
				//asignamos el objeto distribuidor al ArrayList
				Distribuidores.adistribuidores.add(odistribuidor);

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
	
	public static void mostrarDistribuidores()
	{
		if (Distribuidores.adistribuidores!=null)
		{
			System.out.print("\n****INFORMACION DE LOS DISTRIBUIDORES****\n");	
			try
			{
				//Recorremos el arraylist
				for(int i=0; i<Distribuidores.adistribuidores.size(); i++)
				{
		      		System.out.print("\n*************************************\n");
					//escribimos los datos del distribuidor de la posicion i
					System.out.println("DISTRIBUIDOR:" + Distribuidores.adistribuidores.get(i).getNombre());
					System.out.println("CODIGO:" + Distribuidores.adistribuidores.get(i).getCif());
					
					System.out.println("CIUDAD:" + Distribuidores.adistribuidores.get(i).getDireccion().getCiudad());
					System.out.println("CALLE:" + Distribuidores.adistribuidores.get(i).getDireccion().getCalle());
					System.out.println("NUMERO:" + Distribuidores.adistribuidores.get(i).getDireccion().getNumero());
					System.out.println("COD POSTAL:" + Distribuidores.adistribuidores.get(i).getDireccion().getCodPostal());
	
					System.out.println("CONTACTO:" + Distribuidores.adistribuidores.get(i).getContacto().getNombre() + " " + Distribuidores.adistribuidores.get(i).getContacto().getApellido());
					System.out.println("DNI:" + Distribuidores.adistribuidores.get(i).getContacto().getDni());
					System.out.println("TELEFONO:" + Distribuidores.adistribuidores.get(i).getContacto().getTelefono());
				}
				System.out.print("\nFIN DE FICHERO\n");		
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e);
			}
		}
		else System.out.print("\nNo hay distribuidores");

	}
}
