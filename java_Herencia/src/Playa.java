public class Playa extends EspacioPublico {

	//propiedades de la subclase
	public int largura;
	public String color;
	
	//constructor
	Playa()
	{
	}
	//getter y setter
		public void setLargura(int largura){
			this.largura=largura;
		}
		public int getLargura(){
			return largura;
		}
		public void setColor(String color){
			this.color=color;
		}
		public String getColor(){
			return color;
		}
}
