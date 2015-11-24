import java.util.ArrayList; 

public class LlenarLista
{ 
	public static void main(String[ ] args) 
	{ 	//Creamos un objeto arraylist
		ArrayList lista = new ArrayList() ; 
		lista.add(1);//Añade el 1 al final del ArrayList
		lista.add(2);//Añade el 2 al final del ArrayList
		lista.add(4);//Añade el 4 al final del ArrayList
		
		System.out.println("La lista esta compuesta por");
		
		int i;
		for (i=0; i < lista.size();i++) // int size() El tamaño actual 
		//imprime el valor de la lista en la posicion i
		System.out.println(lista.get(i) + " " ) ; 
	} 
} 
