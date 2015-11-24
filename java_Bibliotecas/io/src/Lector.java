import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Lector 
{
   public static void main(String [] arg)
   {
      File archivo = null;
      FileReader lector = null;
      BufferedReader bufer = null;
 
      try 
      {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_BibliotecaJava/io/src/lector.txt");
         lector = new FileReader (archivo);
         bufer = new BufferedReader(lector);
 
         // Lectura del fichero
         String linea = bufer.readLine();
         
         while(bufer.readLine()!=null)
            linea = bufer.readLine();
            System.out.println(linea);
      }
      
      catch(Exception e)
      {
         e.printStackTrace();
      }
      
      finally
      {
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try
         {                    
            if( null != lector )
            {   
               lector.close();     
            }                  
         }

         catch (Exception e2)
         { 
            e2.printStackTrace();
         }
      }
   }
}