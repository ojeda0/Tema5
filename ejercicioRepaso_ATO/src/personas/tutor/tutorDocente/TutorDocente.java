package personas.tutor.tutorDocente;

import personas.tutor.Tutor;

public class TutorDocente extends Tutor {

	//ATRIBUTOS
	private TipoEspecialidad especialidad;

	//CONSTRUCTOR
	public TutorDocente(String nombre, String apellidos, String dni, String email, String especialidad) {
		super(nombre, apellidos, dni, email);
		this.setEspecialidad(especialidad);
	}

	//GETTERS Y SETTERS
	public String getEspecialidad() {
		return especialidad.toString();
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = TipoEspecialidad.valueOf(especialidad.toUpperCase());
	}

	//MÉTODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TutorDocente other = (TutorDocente) obj;
		return super.equals(other);
	}

	@Override
	public String toString() {
		return String.format("TutorDocente [nombre= %s, apellidos= %s, dni= %s, email= %s, especialidad= %s]", super.getNombre(), super.getApellidos(), super.getDni(), super.getEmail(), this.especialidad.toString());
	}

	@Override
	public void saludar() {

		System.out.printf("Hola, me llamo %s y soy tutor docente.\n", super.getNombre());
		
	}
	
	
	
}
