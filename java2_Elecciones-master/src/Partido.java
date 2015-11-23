import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Partido
{
	static Scanner sc = new Scanner(System.in);
	
	private int id;//id del partido
	private String nombre;//nombre del partido
	private String siglas;//siglas de partido
	private int afiliados;//numero de afiliados en el partido
	private String secretario;//nombre del secretario general del partido
		
	void setId(int i)
	{
		this.id=i;
	}
	int getId()
	{
		return id;
	}
	void setNombre(String n)
	{
		this.nombre=n;
	}
	String getNombre()
	{
		return nombre;
	}
	void setSiglas(String s)
	{
		this.siglas=s;
	}
	String getSiglas()
	{
		return siglas;
	}
	void setAfiliados(int a)
	{
		this.afiliados=a;
	}
	int getAfiliados()
	{
		return afiliados;
	}
	void setSecretario(String se)
	{
		this.secretario=se;
	}
	String getSecretario()
	{
		return secretario;
	}
	
	static void nuevoPartido()
	{
		//***************CREAR nuevo PARTIDO y guardarlo en listadoPartidos.txt************
		System.out.println("**********INTRODUCE DATOS DEL PARTIDO POLITICO************");
		try
		{
			File txtCenso = new File("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
			FileWriter fw = new FileWriter(txtCenso, true);
			//pide el ID del partido y lo asigna a id de Partido
			System.out.print("Id del partido:\n");
			fw.write("\n" + sc.nextInt() + ",");
			//pide el nombre del partido y lo asigna a nombre de Partido
			System.out.print("Nombre del partido:\n");
			fw.write(sc.next() + ",");
			//pide las siglas del partido y lo asigna a siglas de Partido
			System.out.print("Siglas del partido:\n");
			fw.write(sc.next() + ",");
			//pide el numero de afiliados del partido y lo asigna a afiliados de Partido
			System.out.print("Numero de afiliados en el partido:\n");
			fw.write(sc.nextInt() + ",");
			//pide el nombre del secretario general del partido y lo asigna a secretario de Partido
			System.out.print("Nombre del secretario general:\n");
			fw.write(sc.next());
			
			fw.close();
		}

		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}
	}
	//************LEER archivo listadoPartidos.txt Y mostrar los partidos existentes*************	
	static void leerPartido()
	{        	
        	String linea="";
    	
    		try
    		{	
    			File archivo = new File("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
    			//File archivo = new File ("./listadoPartidos.txt");
    			FileReader fr = new FileReader (archivo);
    			BufferedReader bf = new BufferedReader(fr);
    	       	linea = bf.readLine();
    			String[] separado = null;//para separar las diferentes propiedades del partido
    			System.out.print("***********INFORMACION DE LOS PARTIDOS*********\n");
    			while (linea!=null)
    			{
    				separado=linea.split(",");

    				System.out.print("ID: " + separado[0]+"\n");
    				System.out.print("NOMBRE: " + separado[1]+"\n");
    				System.out.print("SIGLAS: " + separado[2]+"\n");
    				System.out.print("AFILIADO: " + separado[3]+"\n");
    				System.out.print("SECRETARIO: " + separado[4]+"\n");
    				System.out.print("******************************************"+"\n");
    	 			//leo la proxima linea
    				linea = bf.readLine();
    			}
    			System.out.print("******************************************");
    			bf.close();
    		}

    		catch(Exception e)
    	    {
    			System.out.println("Error: "+e);
    	    }

	}
	
}