package personas.alumno;

import personas.Persona;

public class Alumno extends Persona {

	//ATRIBUTOS
	private int numSegSocial;

	//CONSTRUCTOR
	public Alumno(String nombre, String apellidos, String dni, int numSegSocial) {
		super(nombre, apellidos, dni);
		this.numSegSocial = numSegSocial;
	}

	//GETTERS Y SETTERS
	public int getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(int numSegSocial) {
		this.numSegSocial = numSegSocial;
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
		Alumno other = (Alumno) obj;
		return super.equals(other) && this.numSegSocial == other.numSegSocial;
	}

	@Override
	public String toString() {
		return String.format("Alumno [nombre= %s, apellidos= %s, dni= %s, numSegSocial= %d]", super.getNombre(), super.getApellidos(), super.getDni(), this.numSegSocial);
	}

	@Override
	public void saludar() {
		
		System.out.printf("Hola, me llamo %s y soy alumno.\n", super.getNombre());
		
	}
	
	
	
}
