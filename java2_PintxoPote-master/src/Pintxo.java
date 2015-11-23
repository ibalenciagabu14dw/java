import java.util.ArrayList; 

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Pintxo
{
	private int id;
	private String nombre;
	private String[] ingrediente;
	private int tipo;
			
	//constructor
	public Pintxo()
	{
		
	}

	//id del pintxo
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	//nombre del pintxo
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	//ingredientes del pintxo
	public void setIngrediente(String[] ingrediente)
	{
		this.ingrediente=ingrediente;
	}
	public String[] getIngrediente()
	{
		return ingrediente;
	}

	//tipo de pintxo
	public void setTipo(int tipo)
	{
		this.tipo=tipo;
	}
	public int getTipo()
	{
		return tipo;
	}

//*******************LECTURA DEL FICHERO pintxos.txt y guardarlo en un ArrayList*********************
	public void leerPintxos () 
	{
		String linea="";
		
		try
		{	
			File archivo = new File ("./pintxos.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			Double precio=0.0;
			System.out.print("\n************INFORMACION DE LOS PINTXOS**********\n");
			while (linea!=null)
			{     

				separado=linea.split("#");

				if (Integer.parseInt(separado[3])==1)
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
	
	public ArrayList<Pintxo> cargarPintxos () 
	{		
		
		String linea="";
		
		ArrayList <Pintxo> apintxos = new ArrayList <Pintxo>();
		
		try
		{	
			File archivo = new File ("./pintxos.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			String[] separado2 = null;//para separar los ingredientes
			
			while (linea!=null)
			{     

				//creamos los objetos
				Pintxo opintxo=new Pintxo();
					 			
	 			//separamos los datos en el array
	 			separado=linea.split("#");

	 			//introducimos los valores en los objetos para despues asignarlos al AarrayList
	 			opintxo.setId(Integer.parseInt(separado[0]));
	 			opintxo.setNombre(separado[1]);

	 			//ingredientes
	 			
	 			String ingredientes=separado[2];
				separado2=ingredientes.split(";");

				opintxo.setIngrediente(separado2);
				opintxo.setTipo(Integer.parseInt(separado[3]));
				apintxos.add(opintxo);

	 			//leo la proxima linea
				linea = bf.readLine();

				for (int i=0;i<apintxos.size();i++)
					System.out.print(apintxos.get(i));			
			}
			bf.close();
		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }

	    return apintxos;

	}
}