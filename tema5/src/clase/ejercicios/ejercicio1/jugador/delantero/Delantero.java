package clase.ejercicios.ejercicio1.jugador.delantero;

import clase.ejercicios.ejercicio1.jugador.Jugador;

public abstract class Delantero extends Jugador {

	//ATRIBUTOS
	private int goles;
	
	//CONSTRUCTOR
	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}
	
	//GETTERS Y SETTERS
	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Delantero [nombre = %s, dorsal = %d, equipo = %s, goles = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), this.goles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delantero other = (Delantero) obj;
		return super.equals(obj) && this.goles == other.goles;
	}
	
	
	
}
