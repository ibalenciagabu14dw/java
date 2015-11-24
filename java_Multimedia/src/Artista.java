public class Artista {

	private String dni;
	private String nombre;
	private String apellidos;
	private int anoNacimiento;
	private String pais;

	public Artista(String dni, String nombre, String apellidos, int anoNacimiento, String pais) {
	 
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anoNacimiento = anoNacimiento;
		this.pais = pais;		
	}
	
	public Artista(String lineadArtista, String separator) {
		
		
		String[] strArray = lineadArtista.split(separator);
		this.setDni(strArray[0]);
		this.setNombre(strArray[1]);
		this.setApellidos(strArray[2]);
		this.setAnoNacimiento(Integer.parseInt(strArray[3]));
		this.setPais(strArray[4]);
	}
	
	public String getDni() {
		
		return dni;
	}
	
	public void setDni(String dni) {
		
		this.dni = dni;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String apellidos) {
		
		this.apellidos = apellidos;
	}
	
	public String getApellidos() {
		
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
	}
	
	public int getAnoNacimiento() {
		
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		
		this.anoNacimiento = anoNacimiento;
	}
	
	public String getPais() {
		
		return pais;
	}
	
	public void setPais(String pais) {
		
		this.pais = pais;
	}
	
	public String formattedArtista() {

		String artistaStr = 
		"DNI:" + this.dni + "\n" +
		"NOMBRE ARTISTA:" + this.nombre + "\n" + 
		"APELLIDOS:" + this.apellidos  + "\n" + 
		"NACIMIENTO: " + this.anoNacimiento + "\n" +
		"PAIS" + this.pais;
		
		return artistaStr;
	}
	
}
