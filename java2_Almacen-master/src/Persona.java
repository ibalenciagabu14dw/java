public class Persona {

	private String nombre;
	private String apellidos;
	private String DNI;
	
	//nombre de la persona
		void setNombre(String nombre)
		{
			this.nombre=nombre;
		}
		String getNombre()
		{
			return nombre;
		}

		//Apellido de la persona
		void setApellido(String apellidos)
		{
			this.apellidos=apellidos;
		}
		String getApellido()
		{
			return apellidos;
		}

		//DNI de la persona
		void setDni(String dni)
		{
			this.DNI=dni;
		}
		String getDni()
		{
			return DNI;
		}

}
