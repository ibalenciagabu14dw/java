import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manzana extends Producto
{
	private String color;
	private Double eurosKilo;
	
	//color de manzana
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	//precio de manzana
	public void setEurosKilo(Double euroskilo)
	{
		this.eurosKilo=euroskilo;
	}
	public Double getEurosKilo()
	{
		return eurosKilo;
	}
	
	public final void solicitarDatos()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tipo de manzana: ");
		this.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la manzana: ");
		this.setProcedencia(sc.next());
		System.out.println("Introduce el color de la manzana: ");
		this.setColor(sc.next());
		System.out.println("Introduce el precio de la manzana: ");
		this.setEurosKilo(sc.nextDouble());
		System.out.println("Introduce el codigo de barras de la manzana: ");
		this.setCodBarras(sc.nextInt());
		//bucle para buscar distribuidor
		do
		{
			System.out.println("Introduce el nombre del distribuidor: ");
			//recorremos el ArrayList de distribuidores para buscar el introducido
			Distribuidor distri = new Distribuidor();
					this.setDistribuidor(distri.buscarDistribuidor(sc.next()));
					
		}while (this.getDistribuidor()==null);
		sc.close();
		//asignamos la manzana al ArrayList
		Productos.amanzana.add(this);
	}	
	
	public final void escribirEnFichero() {
		try
		{
			File archivo = new File ("/home/zubiri/ProyectosJava/java2_Almacen/src/productos.txt");
			FileWriter fwproducto = new FileWriter(archivo, true);
			//escribimos en el fichero de productos la nueva manzana
			fwproducto.write("\nManzana,");
			fwproducto.write(this.getTipo() + ",");
			fwproducto.write(this.getProcedencia() + ",");
			fwproducto.write(this.getColor() + ",");
			fwproducto.write(Double.toString(this.getEurosKilo()) + ",");
			fwproducto.write(this.getDistribuidor().getNombre() + "#");
			fwproducto.write(this.getDistribuidor().getContacto().getNombre() + ",");
			fwproducto.write(this.getCodBarras());
			
			//cerramos el archivo
			fwproducto.close();
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e);
		}
	}
}