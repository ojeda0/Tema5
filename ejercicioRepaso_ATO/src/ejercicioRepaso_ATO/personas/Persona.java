package ejercicioRepaso_ATO.personas;

public abstract class Persona {

	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String dni;
	
	//CONSTRUCTOR
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//MÉTODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.nombre.equals(other.nombre) &&
				this.apellidos.equals(other.apellidos) &&
				this.dni.equals(other.dni);
	}

	@Override
	public String toString() {
		return String.format("Persona [nombre= %s, apellidos= %s, dni= %s]", this.nombre, this.apellidos, this.dni);
	}
	
	public abstract void saludar();
	
}
