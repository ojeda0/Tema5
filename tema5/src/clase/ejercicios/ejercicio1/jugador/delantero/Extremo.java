package clase.ejercicios.ejercicio1.jugador.delantero;

import clase.ejercicios.ejercicio1.jugador.Puesto;

public class Extremo extends Delantero {

	// ATRIBUTOS
	private Puesto puesto;

	// CONSTRUCTOR
	public Extremo(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.setPuesto(puesto);
	}

	// GETTER Y SETTERS
	public String getPuesto() {
		return puesto.toString();
	}

	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Extremo [nombre = %s, dorsal = %d, equipo = %s, goles = %d, puesto = %s]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getGoles(), this.puesto.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Extremo other = (Extremo) obj;
		return super.equals(obj) && this.puesto.equals(other.puesto);
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
	

}
