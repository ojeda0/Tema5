package personas.tutor;

import personas.Persona;

public abstract class Tutor extends Persona {

	//ATRIBUTOS
	private String email;

	//CONSTRUCTOR
	public Tutor(String nombre, String apellidos, String dni, String email) {
		super(nombre, apellidos, dni);
		this.email = email;
	}

	//GETTERS Y SETTERS
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Tutor other = (Tutor) obj;
		return super.equals(other) && this.email.equals(other.email);
	}

	@Override
	public String toString() {
		return String.format("Tutor [nombre= %s, apellidos= %s, dni= %s, email= %s]", super.getNombre(), super.getApellidos(), super.getDni(), this.email);
	}
	
	
}
