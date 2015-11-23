import java.util.ArrayList; 

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Pote
{
	private int id;
	private String nombre;
	private int tipo;
		
	//constructor
	public Pote()
	{
		
	}

	//id del pote
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	//nombre del pote
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	//tipo de pote
	public void setTipo(int tipo)
	{
		this.tipo=tipo;
	}
	public int getTipo()
	{
		return tipo;
	}

//*******************LECTURA DEL FICHERO potes.txt y guardarlo en un ArrayList*********************
	public void leerPotes () 
	{
		String linea="";
		
		try
		{	
			File archivo = new File ("./potes.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			Double precio=0.0;
			System.out.print("\n***********INFORMACION DE LOS PINTXOS*********\n");
			while (linea!=null)
			{     

				separado=linea.split("#");

				if (Integer.parseInt(separado[2])==1)
					{precio=1.50;}
				else {precio=2.00;}

				System.out.print("\n" + separado[1] + " " + precio+"€");	 			

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
	
	public ArrayList<Pote> cargarPotes () 
	{		
		
		String linea="";
		
		ArrayList <Pote> apotes = new ArrayList <Pote>();
		
		try
		{	
			File archivo = new File ("./potes.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			
			
			while (linea!=null)
			{     

				Pote opotes = new Pote();
					 			
	 			//separamos los datos en el array
	 			separado=linea.split(",");

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			opotes.setId(Integer.parseInt(separado[0]));
	 			opotes.setNombre(separado[1]);
				opotes.setTipo(Integer.parseInt(separado[2]));

				apotes.add(opotes);

	 			//leo la proxima linea
				linea = bf.readLine();
			}
			bf.close();
		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }

	    return apotes;

	}
}