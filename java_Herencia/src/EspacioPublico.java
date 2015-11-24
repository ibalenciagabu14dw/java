public class EspacioPublico {
	private int id;
	private String nombre;
	private String direccion;
	
	//constructor
	EspacioPublico(){
	}
	//getter y setter
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	}
	
}
