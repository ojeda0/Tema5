package clase.ejercicios.ejercicio1.jugador;

public abstract class Jugador {

	//ATRIBUTOS
	private String nombre;
	private int dorsal;
	private String equipo;
	
	//CONSTRUCTOR
	public Jugador(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	//MÉTODOS
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return String.format("Jugador [nombre = %s, dorsal = %d, equipo = %s]", this.nombre, this.dorsal, this.equipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return this.nombre.equals(other.nombre) &&
				this.dorsal == other.dorsal &&
				this.equipo.equals(other.equipo);
	}
	
	
}
