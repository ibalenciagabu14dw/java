import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Leche extends Producto
{
	private Double eurosLitro;
	
	//Precio de leche
	public void setEurosLitro(Double euroslitro)
	{
		this.eurosLitro=euroslitro;
	}
	public Double getEurosLitro()
	{
		return eurosLitro;
	}
	
	public final void solicitarDatos()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tipo de leche: ");
		this.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la leche: ");
		this.setProcedencia(sc.next());
		System.out.println("Introduce el precio de la leche: ");
		this.setEurosLitro(sc.nextDouble());
		System.out.println("Introduce el codigo de barras de la leche: ");
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
		//asignamos la leche al ArrayList
		Productos.aleche.add(this);
	}	
	
	public final void escribirEnFichero() {
		try
		{
			File archivo = new File ("/home/zubiri/ProyectosJava/java2_Almacen/src/productos.txt");
			FileWriter fwproducto = new FileWriter(archivo, true);
			//escribimos en el fichero de productos la nueva leche
			fwproducto.write("\nLeche,");
			fwproducto.write(this.getTipo() + ",");
			fwproducto.write(this.getProcedencia() + ",");
			fwproducto.write(Double.toString(this.getEurosLitro()) + ",");
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