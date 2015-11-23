package java2_Interface;

public class Rectangulo implements FiguraGeometrica{
	private float lado; 
	private float altura;

	public Rectangulo (float lado, float altura){
		this.lado = lado; 
		this.altura = altura; 
		}
	
	public float area(){
		return lado*altura; 
		}
}
