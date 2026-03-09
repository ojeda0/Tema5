package clase.ejercicios.ejercicioPadel.instalaciones.partido;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
	public Partido(Pista pista, int numJugadores) {
		this.codigo = Partido.contador++;
		this.pista = pista;
		this.setNumJugadores(numJugadores);
		this.jugadores = new ArrayList<>();
		this.firmaEmpleado = null;
		this.firmaJugadores = null;
		this.responsable = null;
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
		
		if(numJugadores < 2) {
			
			throw new IllegalArgumentException("ERROR. El partido debe tener un mínimo de 2 jugadores.");
			
		}
		
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

	//MÉTODOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return this.codigo == other.codigo && 
				this.pista.equals(other.pista) &&
				this.numJugadores == other.numJugadores &&
				this.jugadores.equals(other.jugadores) &&
				this.firmaEmpleado.equals(other.firmaEmpleado) &&
				this.firmaJugadores.equals(other.firmaJugadores) &&
				this.responsable.equals(other.responsable);
	}

	@Override
	public String toString() {
		return String.format("Partido [codigo = %d, pista = %s, numJugadores = %d, jugadores = %s, firmaEmpleado = %s, firmaJugadores = %s, "
				+ "responsable = %s]", this.codigo, this.pista.toString(), this.numJugadores, this.jugadores.toString(), 
				this.firmaEmpleado.toString(), this.firmaJugadores.toString(), this.responsable.toString());
	}
	
	public void asociarJugador(Jugador jugador) {
		
		if(this.completo()) {
			
			throw new IllegalArgumentException("ERROR. El partido está completo de jugadores.");
			
		}
		
		this.jugadores.add(jugador);
		
	}
	
	public void eliminarJugador(int posicionJugador) {
		
		if(this.jugadores.size() == 0) {
			
			throw new IllegalArgumentException("ERROR. Todavía no hay ningún jugador asociado.");
			
		}
		
		if(posicionJugador < 0 || posicionJugador >= this.jugadores.size()) {
			
			throw new IllegalArgumentException("ERROR. El índice del jugador indicado se encuentra fuera del límite.");
			
		}
		
		this.jugadores.remove(posicionJugador);
		
	}
	
	public boolean completo() {
		
		return this.jugadores.size() == this.numJugadores;
		
	}
	
	public void reservar() {
		
		if(!this.completo()) {
			
			throw new IllegalArgumentException("ERROR. No se puede reservar si la pista no tiene todos los jugadores.");
			
		}
		
		if(this.firmaJugadores != null) {
			
			throw new IllegalArgumentException("ERROR. Ya se ha reservado con una firma de jugadores.");
			
		}
		
		this.firmaJugadores = LocalDateTime.now();
		
	}
	
	public void reservar(Empleado empleadoResponsable) {
		
		if(this.firmaJugadores == null) {
			
			throw new IllegalArgumentException("ERROR. El empleado no puede firmar hasta que haya firmado el jugador.");
			
		}
		
		if(!this.completo()) {
			
			throw new IllegalArgumentException("ERROR. Faltan jugadores por asignar.");
			
		}
		
		if(this.firmaEmpleado != null) {
			
			throw new IllegalArgumentException("ERROR. Este partido ya ha sido firmado por el empleado con código " + this.responsable.getCodEmpleado());
			
		}
		
		this.responsable = empleadoResponsable;
		this.firmaEmpleado = LocalDateTime.now();
		
	}
	
	public String estado() {
		
		String estado = "PENDIENTE";
		
		if(this.firmaJugadores != null && this.firmaEmpleado != null) {
			
			estado = "CONFIRMADO";
			
		}
		else if(this.firmaJugadores != null) {
			
			estado = "RESERVADO";
			
		}
		
		return estado;
		
	}

	
}
