package personas.tutor.tutorLaboral;

import personas.tutor.Tutor;

public class TutorLaboral extends Tutor {

	//ATRIBUTOS
	private TipoCargo cargo;

	//CONSTRUCTOR
	public TutorLaboral(String nombre, String apellidos, String dni, String email, String cargo) {
		super(nombre, apellidos, dni, email);
		this.setCargo(cargo);
	}

	//GETTERS Y SETTERS
	public String getCargo() {
		return cargo.toString();
	}

	public void setCargo(String cargo) {
		this.cargo = TipoCargo.valueOf(cargo.toUpperCase());
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
		TutorLaboral other = (TutorLaboral) obj;
		return super.equals(other);
	}

	@Override
	public String toString() {
		return String.format("TutorLaboral [nombre= %s, apellidos= %s, dni= %s, email= %s, cargo= %s]", super.getNombre(), super.getApellidos(), super.getDni(), super.getEmail(), this.cargo.toString());
	}

	@Override
	public void saludar() {

		System.out.printf("Hola, me llamo %s y soy tutor laboral.\n", super.getNombre());
		
	}
	
	
	
}
