import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Ayuntamiento extends Inmueble
{
	private String nombrealcalde;

	void setNombreAlcalde(String nombrealcalde)
	{
		this.nombrealcalde=nombrealcalde;
	}
	String getNombreAlcalde()
	{
		return nombrealcalde;
	}
	
	//crear nuevo objeto ayuntamiento y guardarlo en ayuntamiento.txt
	
	
	static final void NuevoAyuntamiento()
	{
		System.out.println("**********INTRODUCE DATOS DEL INMUEBLE************");
		try
		{
			Scanner sc = new Scanner(System.in);
			File txtCenso = new File("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/ayuntamiento.txt");
			FileWriter fw = new FileWriter(txtCenso, true);
			
			System.out.print("\nID del ayuntamiento: ");
			fw.write("\n" + sc.nextInt() + ",");
			
			System.out.print("\nNombre del ayuntamiento: ");
			fw.write(sc.next() + ",");
			
			System.out.print("\nDireccion del ayuntamiento: ");
			fw.write(sc.next() + ",");
			
			System.out.print("\nPoblacion del ayuntamiento: ");
			fw.write(sc.next() + ",");
			
			System.out.print("\nEl alcalde del ayuntamiento: ");
			fw.write(sc.next());
			
			fw.close();
		}

		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}
	}
	public void mostrar()
	{
		String linea="";
    	try
		{	
			File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/ayuntamiento.txt");
			//File archivo = new File ("./ayuntamiento.txt");
			FileReader fr = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar las diferentes propiedades del ayuntamiento
			System.out.print("***********INFORMACION DE LOS AYUNTAMIENTOS*********\n");
			while (linea!=null)
			{
				separado=linea.split(",");

				System.out.print("ID: " + separado[0]+"\n");
				System.out.print("NOMBRE: " + separado[1]+"\n");
				System.out.print("DIRECCION: " + separado[2]+"\n");
				System.out.print("POBLACION: " + separado[3]+"\n");
				System.out.print("ALCALDE: " + separado[4]+"\n");
				System.out.print("******************************************"+"\n");
	 			//leo la proxima linea
				linea = bf.readLine();
			}
			System.out.print("******************************************");
			bf.close();		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }
	}
}