import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escritor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;
        try 
        {
            //si no existe el fichero lo crea
            salida = new PrintWriter("/home/ibalenciaga/ProyectosJava/java2_BibliotecaJava/io/src/Escritor.txt");
            String cadena;
            System.out.println("Introduce texto. Para acabar escribe un punto y pulsa intro\n");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase(".")) //mientras no se haya introducido un punto
            {
                salida.println(cadena);//escribe en el fichero lo que se escribe por teclado
                cadena = sc.nextLine();//lee la siguiente fila
            }
           
        } 

        catch (FileNotFoundException e) 
        {
            System.out.println(e.getMessage());
        } 
        
        finally 
        {         
            salida.close();
        }
    }
}
