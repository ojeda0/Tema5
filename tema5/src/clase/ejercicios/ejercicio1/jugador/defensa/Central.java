package clase.ejercicios.ejercicio1.jugador.defensa;

public class Central extends Defensa {

	//ATRIBUTOS
	private int entradas;
	
	//CONSTRUCTOR
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas = entradas;
	}
	
	//GETTERS Y SETTERS
	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Central [nombre = %s, dorsal = %d, equipo = %s, disputasRealizadas = %d, entradas = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getDisputasRealizadas(), this.entradas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Central other = (Central) obj;
		return super.equals(obj) && this.entradas == other.entradas;
	}
	
	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
}
