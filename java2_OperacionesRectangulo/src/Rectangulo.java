/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Rectangulo{

public double base=0, altura=0;


public double getBase()
{
return base;
}

public void setBase(double oinarri)
{
base=oinarri;
}
public double getAltura()
{
return altura;
}

public void setAltura(double altuera)
{
altura=altuera;
}

 //Método que suma dos números enteros y devuelve el resultado.
 public double area () {

	double resul = this.getBase() * this.getAltura();
	return resul;
 }



 //Método que suma dos números enteros y devuelve el resultado.
 public double perimetro() {

	double resul = 2 * (this.getBase() + this.getAltura());
	return resul;
 }

}
