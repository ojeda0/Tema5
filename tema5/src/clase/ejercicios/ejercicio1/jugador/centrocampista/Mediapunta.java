package clase.ejercicios.ejercicio1.jugador.centrocampista;

public class Mediapunta extends Centrocampista {

	//ATRIBUTOS
	private int asistencias;
	
	//CONSTRUCTOR
	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}
	
	//GETTERS Y SETTERS
	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Mediapunta [nombre = %s, dorsal = %d, equipo = %s, pasesCompletados = %d, asistencias = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getPasesCompletados(), this.asistencias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mediapunta other = (Mediapunta) obj;
		return super.equals(obj) && this.asistencias == other.asistencias;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
	
	
}
