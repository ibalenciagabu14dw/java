/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Circulo {
static final double NUM_PI = 3.1416;
public double radio=0;


public double getRadio()
{return radio;}

public void setRadio(double rad)
{radio=rad;}

 //Método que suma dos números enteros y devuelve el resultado.
 public double area () {

	double resul = NUM_PI * this.getRadio() * this.getRadio();
	return resul;
 }



 //Método que suma dos números enteros y devuelve el resultado.
 public double circunferencia () {

	double resul = 2 * NUM_PI * this.getRadio();
	return resul;
 }

}
