package java2_Interface;

public class Circulo implements FiguraGeometrica{
	private float radio;
	public Circulo (float radio){
		this.radio = radio;
		}
	public float area(){
		return (2*PI*radio); 
		}

}
