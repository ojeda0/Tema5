package clase.ejercicios.ejercicioPadel.personas.empleado;

import clase.ejercicios.ejercicioPadel.personas.Persona;

public class Empleado extends Persona {

	//ATRIBUTOS
	private int codEmpleado;

	//CONSTRUCTOR
	public Empleado(String nombre, String apellidos, String dni, int codEmpleado) {
		super(nombre, apellidos, dni);
		this.codEmpleado = codEmpleado;
	}

	//GETTERS Y SETTERS
	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
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
		Empleado other = (Empleado) obj;
		return super.equals(other) && this.codEmpleado == other.codEmpleado;
	}

	@Override
	public String toString() {
		return String.format("Empleado [nombre = %s, apellidos = %s, dni = %s, codEmpleado = %d]", super.getNombre(), super.getApellidos(), super.getDni(), this.codEmpleado);
	}

	@Override
	public void saludar() {
		
		System.out.printf("Hola, me llamo %s y soy empleado.\n", super.getNombre());
		
	}
	
	
}
