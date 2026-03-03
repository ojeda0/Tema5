package clase.ejercicios.ejercicioPadel.instalaciones.partido;

import java.time.LocalDateTime;
import java.util.List;

import clase.ejercicios.ejercicioPadel.instalaciones.pista.Pista;
import clase.ejercicios.ejercicioPadel.personas.empleado.Empleado;
import clase.ejercicios.ejercicioPadel.personas.jugador.Jugador;

public class Partido {

	//ATRIBUTOS
	private static int contador = 1;
	
	private int codigo;
	private Pista pista;
	private int numJugadores;
	private List<Jugador> jugadores;
	private LocalDateTime firmaEmpleado;
	private LocalDateTime firmaJugadores;
	private Empleado responsable;
	
	//CONSTRUCTOR
	public Partido(Pista pista, int numJugadores, List<Jugador> jugadores, LocalDateTime firmaEmpleado,
			LocalDateTime firmaJugadores, Empleado responsable) {
		this.codigo = Partido.contador++;
		this.pista = pista;
		this.numJugadores = numJugadores;
		this.jugadores = jugadores;
		this.firmaEmpleado = firmaEmpleado;
		this.firmaJugadores = firmaJugadores;
		this.responsable = responsable;
	}

	//GETTERS Y SETTERS
	public Pista getPista() {
		return pista;
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public LocalDateTime getFirmaEmpleado() {
		return firmaEmpleado;
	}

	public void setFirmaEmpleado(LocalDateTime firmaEmpleado) {
		this.firmaEmpleado = firmaEmpleado;
	}

	public LocalDateTime getFirmaJugadores() {
		return firmaJugadores;
	}

	public void setFirmaJugadores(LocalDateTime firmaJugadores) {
		this.firmaJugadores = firmaJugadores;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
}
