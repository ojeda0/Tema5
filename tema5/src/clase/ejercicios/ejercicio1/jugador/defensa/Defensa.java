package clase.ejercicios.ejercicio1.jugador.defensa;

import clase.ejercicios.ejercicio1.jugador.Jugador;

public abstract class Defensa extends Jugador {

	//ATRIBUTOS
	private int disputasRealizadas;
	
	//CONSTRUCTOR
	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}
	
	//GETTERS Y SETTERS
	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Defensa [nombre = %s, dorsal = %d, equipo = %s, disputasRealizadas = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), this.disputasRealizadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Defensa other = (Defensa) obj;
		return super.equals(other) && this.disputasRealizadas == other.disputasRealizadas;
	}
	
}
