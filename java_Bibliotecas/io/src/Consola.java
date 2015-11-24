import java.io.Console;

public class Consola 
{
	public static void main (String args[])
	{

		Console consola= System.console();

		//si consola es null significa que no tenemos consola 
		if (consola==null)
		{
			System.out.printf ("No existe una consola");
			System.exit(0); //Termina la aplicación
		}

		consola.printf("user: ");
		String usuario= consola.readLine();
		consola.printf("pass: ");
		char password[] = consola.readPassword();//no muestra la contrasena


		String pass= new String (password);

		consola.printf("\nEl usuario introducido es: " + usuario + ", y el password es: " + pass + "\n");
	}
}
