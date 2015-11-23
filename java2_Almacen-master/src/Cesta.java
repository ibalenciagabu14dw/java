import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList; 
import java.util.Scanner;

public class Cesta
{

	//Propiedades
	static ArrayList <Manzana> amanzanaC;
	static ArrayList <Lechuga> alechugaC;
	static ArrayList <Leche> alecheC;
	
	//Manzana
	public void setManzana(ArrayList <Manzana> manzana)
	{
		amanzanaC=manzana;
	}
	public ArrayList <Manzana> getManzana()
	{
		return amanzanaC;
	}

	//Lechuga
	public void setLechuga(ArrayList <Lechuga> lechuga)
	{
		alechugaC=lechuga;
	}
	public ArrayList <Lechuga> getLechuga()
	{
		return alechugaC;
	}

	//Leche
	public void setLeche(ArrayList <Leche> leche)
	{
		alecheC=leche;
	}
	public ArrayList <Leche> getLeche()
	{
		return alecheC;
	}

	 //Metodo que saca el importe de la compra
 	public Double total(Double importe, Double descuento)
	{
	Double resul = importe - descuento;
	return resul;
 	}
 	
 	public static void mostrarProductos()
	{
		Scanner sc = new Scanner(System.in);
 		
		System.out.println("**************** PRODUCTOS DISPONIBLES **************************");

		//leemos el archivo de productos para mostrar despues una lista
		try
		{	
			String linea = "";
			FileReader fr = new FileReader(Productos.archivo);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;
			
			while (linea!=null)
			{     

				//separamos los datos en el array
	 			separado=linea.split(";");

	 			System.out.println("PRODUCTO: " + separado[0] + "  TIPO: " + separado[1] + "  COD_BARRAS: " + separado[separado.length-1]);

	 			//leo la proxima linea
				linea = bf.readLine();
			}
			bf.close();
		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }
		sc.close();
	}

 	public static void realizarPedido()
 	{
 		Scanner sc = new Scanner(System.in);
 		//vaciamos las cestas
 		amanzanaC.clear();
 		alechugaC.clear();
 		alecheC.clear();
 		
 		//mostramos los productos disponibles
 		mostrarProductos();
 		//creamos la cesta de la compra
		Cesta cesta =new Cesta();
		String resp;

		//pedimos el nombre del cliente para sacar el descuento que tiene
		System.out.println("Introduce el nombre del cliente:");
		Cliente.nombreCliente=sc.next();
		//pedimos el producto, lo buscamos y lo asignamos a la cesta
		do
		{	
			//pedimos el codigo de barras
			System.out.println("Introduce el codigo de barras del producto:");
			int cod=sc.nextInt();
			//buscamos el producto
			//miramos si el producto es una manzana
			for (int i=0;i<Productos.amanzana.size();i++)
			{
				if (cod==Productos.amanzana.get(i).getCodBarras())
					amanzanaC.add(Productos.amanzana.get(i));
			}
			cesta.setManzana(amanzanaC);

			//miramos si el producto es una lechuga
			for (int i=0;i<Productos.alechuga.size();i++)
			{
				if (cod==Productos.alechuga.get(i).getCodBarras())
					alechugaC.add(Productos.alechuga.get(i));	
			}

			//miramos si el producto es leche
			for (int i=0;i<Productos.aleche.size();i++)
			{
				if (cod==Productos.aleche.get(i).getCodBarras())
					alecheC.add(Productos.aleche.get(i));
				
			}
			
			
			System.out.println("Quieres seguir añadiendo productos? SI/NO:");
			resp=sc.next();
		}while (resp.equalsIgnoreCase("si"));
		sc.close();
 	}
}