import java.util.ArrayList; 

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Bar
{
	private int id;
	private String nombre;
	private String direccion;
	private ArrayList <Pintxo> pintxos;
	private ArrayList <Pote> potes;
		
	//constructor
	public Bar()
	{
		
	}

	//id del bar
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	//nombre del bar
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	//direccion del bar
	public void setDireccion(String dir)
	{
		this.direccion=dir;
	}
	public String getDireccion()
	{
		return direccion;
	}

	//pintxos del bar
	public void setPintxos(ArrayList <Pintxo> pintxos)
	{
		this.pintxos=pintxos;
	}
	public ArrayList <Pintxo> getPintxos()
	{
		return pintxos;
	}

	//potes del bar
	public void setPotes(ArrayList <Pote> potes)
	{
		this.potes=potes;
	}
	public ArrayList <Pote> getPotes()
	{
		return potes;
	}

	//*******************LECTURA DEL FICHERO bares.txt y guardarlo en un ArrayList*********************
	//muestra la informacion del bar
		public void leerBares () 
		{		
			
			String linea="";

			try
			{	
				File archivo = new File ("./bares.txt");
				FileReader fr = new FileReader (archivo);
				BufferedReader bf = new BufferedReader(fr);
		       	linea = bf.readLine();
				String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
				
				System.out.print("\n*********INFORMACION DE LOS BARES*********\n");
				while (linea!=null)
				{     
					//separamos los datos en el array
		 			separado=linea.split(",");				
					System.out.print("\n NOMBRE: " + separado[1] + "          DIRECCION: " + separado[2]);
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
		
		public ArrayList<Bar> cargarBares () 
	{		
		
		String linea="";
		
		ArrayList <Bar> abares = new ArrayList <Bar>();
		ArrayList <Pintxo> apintxo = new ArrayList <Pintxo>();
		ArrayList <Pote> apote = new ArrayList <Pote>();
		
		try
		{	
			File archivo = new File ("./bares.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			String[] separado2 = null;
			String[] separado3 = null;
			
			while (linea!=null)
			{     

				Bar obar = new Bar();
					 			
	 			//separamos los datos en el array
	 			separado=linea.split(",");

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			obar.setId(Integer.parseInt(separado[0]));
	 			obar.setNombre(separado[1]);
				obar.setDireccion(separado[2]);
				//Pintxo
				
				Pintxo opintxo = new Pintxo();
				//separamos los diferentes pintxos
				separado2=separado[3].split(":");
				//recorremos el string para introducir cada pintxo en el arraylist
				for (int i=0;i<separado2.length;i++)
					{
						//separamos las partes del string
						separado3=separado2[i].split("#");
						//asignamos los datos al objeto pintxo
						opintxo.setId(Integer.parseInt(separado3[0]));
						opintxo.setNombre(separado3[1]);
						//separamos la parte de los ingredientes
						String[] separado4=separado3[2].split(";");
						//asignamos los ultimos datos al objeto
						opintxo.setIngrediente(separado4);
						opintxo.setTipo(Integer.parseInt(separado3[3]));
						//asignamos al arraylist los datos del pintxo leido
						apintxo.add(opintxo);
					}
				//asignamos al objeto bar el arraylist de los pintxos
				obar.setPintxos(apintxo);
		
				//potes
				Pote opote = new Pote();
				//separamos los diferentes potes
				separado2=separado[4].split("#");
				//recorremos el string para introducir cada pote en el arraylist
				for (int i=0;i<separado2.length;i++)
					{
						//asignamos las propiedades del pote
						opote.setId(Integer.parseInt(separado2[0]));
						opote.setNombre(separado2[1]);
						opote.setTipo(Integer.parseInt(separado2[2]));
						//asignamos el pote al arraylist
						apote.add(opote);
					}
				//asignamos el arraylist pote al objeto bar
				obar.setPotes(apote);
				//asignamos al arraylist de los bares la informacion del ultimo bar leido
				abares.add(obar);
				
	 			//leo la proxima linea
				linea = bf.readLine();
			}
			bf.close();
		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }

	    return abares;

	}
}