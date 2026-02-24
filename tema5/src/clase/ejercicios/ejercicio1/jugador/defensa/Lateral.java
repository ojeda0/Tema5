package clase.ejercicios.ejercicio1.jugador.defensa;

import clase.ejercicios.ejercicio1.jugador.Puesto;

public class Lateral extends Defensa {

	//ATRIBUTOS
	private Puesto puesto;
	
	//CONSTRUCTOR
	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.setPuesto(puesto);
	}

	//GETTER Y SETTERS
	public String getPuesto() {
		return puesto.toString();
	}

	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}

	//METODOS
	@Override
	public String toString() {
		return String.format("Lateral [nombre = %s, dorsal = %d, equipo = %s, disputasRealizadas = %d, puesto = %s]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getDisputasRealizadas(), this.puesto.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lateral other = (Lateral) obj;
		return super.equals(other) && this.puesto.equals(other.puesto);
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
	
	
	
}
