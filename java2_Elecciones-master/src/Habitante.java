import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Habitante
{
	static Scanner sc = new Scanner(System.in);
	
	public String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private String sexo;
	private int telefono;
	private String poblacion;

	public Habitante()
	{
	}

	public void setNombre(String n)
	{
		this.nombre=n;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setApellido(String a)
	{
		this.apellido=a;
	}
	public String getApellido()
	{
		return apellido;
	}

	public void setDni(String d)
	{
		this.dni=d;
	}
	public String getDni()
	{
		return dni;
	}

	public void setEdad(int e)
	{
		this.edad=e;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setSexo(String s)
	{
		this.sexo=s;
	}
	public String getSexo()
	{
		return sexo;
	}

	public void setTelefono(int t)
	{
		this.telefono=t;
	}
	public int getTelefono()
	{
		return telefono;
	}
	public void setPoblacion(String p)
	{
		this.poblacion=p;
	}

	public String getPoblacion()
	{
		return poblacion;
	}
	
	static void nuevoHabitante()
	{
		
	//******************CREAR nuevo HABITANTE y guardarlo en censo.txt*******************
		try
		{
			File txtCenso = new File("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/censo.txt");
			FileWriter fw = new FileWriter(txtCenso, true);
			
			
			System.out.println("**************INTRODUCE DATOS DEL HABITANTE******************************");
			//pide el nombre del habitante y lo escribe en el fichero
			System.out.print("\nNombre del habitante: ");
			fw.write("\n" + sc.next() + ",");
			//pide el apellido del habitante y lo escribe en el fichero
			System.out.print("\nApellido del habitante: ");
			fw.write(sc.next() + ",");
			//pide el DNI del habitante y lo escribe en el fichero
			System.out.print("\nDNI del habitante: ");
			fw.write(sc.next() + ",");
			//pide la edad del habitante y lo escribe en el fichero
			System.out.print("\nEdad del habitante: ");
			fw.write(sc.nextInt() + ",");
			//pide el sexo del habitante y lo escribe en el fichero
			System.out.print("\nSexo del habitante: ");
			fw.write(sc.next() + ",");
			//pide el telefono del habitante y lo escribe en el fichero
			System.out.print("\nTelefono del habitante: ");
			fw.write(sc.nextInt() + ",");
			//pide la poblacion del habitante y lo escribe en el fichero
			System.out.print("\nPoblacion del habitante: ");
			fw.write(sc.next());
			
			fw.close();
		}

		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}
	}
}