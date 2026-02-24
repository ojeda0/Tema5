package clase.ejercicios.ejercicio1.jugador.centrocampista;

public class Pivote extends Centrocampista{

	//ATRIBUTOS
	private int intercepciones;
	
	//CONSTRUCTOR
	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}
	
	//GETTERS Y SETTERS
	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}
	
	//METODOS
	@Override
	public String toString() {
		return String.format("Pivote [nombre = %s, dorsal = %d, equipo = %s, pasesCompletados = %d, intercepciones = %d]", super.getNombre(), super.getDorsal(), super.getEquipo(), super.getPasesCompletados(), this.intercepciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pivote other = (Pivote) obj;
		return super.equals(obj) && this.intercepciones == other.intercepciones;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println(this.toString());
		
	}
	
	
}
