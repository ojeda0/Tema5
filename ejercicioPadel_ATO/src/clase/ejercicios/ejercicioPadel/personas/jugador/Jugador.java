package clase.ejercicios.ejercicioPadel.personas.jugador;

import clase.ejercicios.ejercicioPadel.personas.Persona;

public abstract class Jugador extends Persona {

	//ATRIBUTOS
	private int codSocio;

	//CONSTRUCTOR
	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
		this.codSocio = codSocio;
	}

	//GETTERS Y SETTERS
	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
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
		Jugador other = (Jugador) obj;
		return super.equals(other) && this.codSocio == other.codSocio;
	}

	@Override
	public String toString() {
		return String.format("Jugador [nombre = %s, apellidos = %s, dni = %s, codSocio = %d]", super.getNombre(), super.getApellidos(), super.getDni(), this.codSocio);
	}
	
	
}
