import java.util.Vector;

public class VectorEjemplo
{

   public static void main(String args[]) 
   {

      // tamaño inicial 5, incremento de 3
      Vector v=new Vector(5, 3);
      
      v.add("uno");
      v.add("dos");
      v.add("cuatro");
      v.add("cinco");
      v.add("seis");
      v.add("siete");
      v.add("ocho");
      v.add("nueve");
      v.add("diez");
      v.add("once");
      v.add("doce");
      v.insertElementAt("tres", 2);

      System.out.println("Elementos del vector:");

      for (int i=0;i<v.size();i++)
{
           System.out.println(v.elementAt(i));

}
         System.out.println("nº de elementos "+v.size());
        System.out.println("dimensión "+v.capacity());
   }
}