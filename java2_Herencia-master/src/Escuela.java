public class Escuela extends EspacioPublico {

	//propiedades de la subclase
	//numero de alumnos
	public int alumnos;
	public String director;
	
	//constructor
	Escuela(){
	}
	//getter y setter
		public void setAlumnos(int alumnos)
		{
			this.alumnos=alumnos;
		}
		public int getAlumnos()
		{
			return alumnos;
		}
		public void setDirector(String director)
		{
			this.director=director;
		}
		public String getDirector(){
			return director;
		}
}
