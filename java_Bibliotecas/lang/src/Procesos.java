import java.util.*;
	import java.io.*;
	import java.lang.ProcessBuilder.Redirect;

	public class Procesos {
		public static void main(String[] args) throws IOException {


		String comando ="";
		
		
		//Utilizamos Scanner y lo guardamos en la variable sc
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscribe el comando que quieras usar para salir escribe salir");
		comando = sc.next();		


		try
		{

			//creacion del bucle para poder ejecutar cuantos comandos queramos
			while (!comando.equals("salir") )
			{
				


			//se crea el constructor ProcessBuilder para que el comando introducido pueda ser ejecutado


			ProcessBuilder processBuilder = new ProcessBuilder(comando);

			//se cambia la salida e imprimira en el fichero txt
			File dirOut = new File("/home/ibalenciaga/ProyectosJava/java2_BibliotecaJava/lang/src/Resultado.txt");
			File dirErr = new File("/home/ibalenciaga/ProyectosJava/java2_BibliotecaJava/lang/src/Error.txt");

			processBuilder.redirectOutput(dirOut);
			processBuilder.redirectError(dirErr);
		

			String salida;		

			Process proceso= processBuilder.start();
			proceso.waitFor();
			
						
			//lectura del fichero donde esta escrito la salida, despues lo imprimira en la pantalla

			FileReader leer = new FileReader("/home/ibalenciaga/ProyectosJava/java2_BibliotecaJava/lang/src/Resultado.txt");
			
			BufferedReader bf = new BufferedReader(leer);
			while ((salida = bf.readLine())!=null) 
				{
   				System.out.println(salida);
				}

			System.out.println("\nEscribe el comando que quieras usar para salir escribe salir");
			comando = sc.next();
			}
		}
		
		catch (InterruptedException e) 
		{
			System.out.println("error");
		}
	}
}