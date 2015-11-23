import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Lechuga extends Producto
{
	private String color;
	private Double eurosUnidad;
			
	//color de lechuga
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}

	//precio de lechuga
	public void setEurosUnidad(Double eurosunidad)
	{
		this.eurosUnidad=eurosunidad;
	}
	public Double getEurosUnidad()
	{
		return eurosUnidad;
	}
	
		
	public void solicitarDatos()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tipo de lechuga: ");
		this.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la lechuga: ");
		this.setProcedencia(sc.next());
		System.out.println("Introduce el color de la lechuga: ");
		this.setColor(sc.next());
		System.out.println("Introduce el precio de la lechuga: ");
		this.setEurosUnidad(sc.nextDouble());
		System.out.println("Introduce el codigo de barras de la lechuga: ");
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
		//asignamos la lechuga al ArrayList
		Productos.alechuga.add(this);
	}	
	
	public final void escribirEnFichero() {
		try
		{
			File archivo = new File ("/home/zubiri/ProyectosJava/java2_Almacen/src/productos.txt");
			FileWriter fwproducto = new FileWriter(archivo, true);
			//escribimos en el fichero de productos la nueva lechuga
			fwproducto.write("\nLechuga,");
			fwproducto.write(this.getTipo() + ",");
			fwproducto.write(this.getProcedencia() + ",");
			fwproducto.write(this.getColor() + ",");
			fwproducto.write(Double.toString(this.getEurosUnidad()) + ",");
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