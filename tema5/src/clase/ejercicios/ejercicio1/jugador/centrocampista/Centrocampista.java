package clase.ejercicios.ejercicio1.jugador.centrocampista;

import clase.ejercicios.ejercicio1.jugador.Jugador;

public abstract class Centrocampista extends Jugador {

	//ATRIBUTOS
	private int pasesCompletados;
	
	//CONSTRUCTOR
	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}
	
	//GETTERS Y SETTERS
	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Centrocampista [nombre = %s, dorsal = %d, equipo = %s, pasesCompletados = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), this.pasesCompletados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centrocampista other = (Centrocampista) obj;
		return super.equals(obj) && this.pasesCompletados == other.pasesCompletados;
	}
	
}
