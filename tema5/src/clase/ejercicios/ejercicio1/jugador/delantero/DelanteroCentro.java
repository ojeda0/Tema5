package clase.ejercicios.ejercicio1.jugador.delantero;

public class DelanteroCentro extends Delantero {

	//ATRIBUTOS
	private int golesDePenalti;
	
	//CONSTRUCTOR
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}
	
	//GETTERS Y SETTERS
	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("DelanteroCentro [nombre = %s, dorsal = %d, equipo = %s, goles = %d, golesDePenalti = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getGoles(), this.golesDePenalti);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DelanteroCentro other = (DelanteroCentro) obj;
		return super.equals(obj) && this.golesDePenalti == other.golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
}
