package clase.ejercicios.ejercicio1;

import java.util.List;

import clase.ejercicios.ejercicio1.jugador.Jugador;
import clase.ejercicios.ejercicio1.jugador.Puesto;
import clase.ejercicios.ejercicio1.jugador.defensa.Central;
import clase.ejercicios.ejercicio1.jugador.defensa.Lateral;
import clase.ejercicios.ejercicio1.jugador.portero.Portero;

public class Equipo {

	private List<Jugador> jugadores;
	
	public void addJugador(int index, Jugador j) {
		
//		0: Portero.
		if(index != 0 && j instanceof Portero) {
			
			throw new IllegalArgumentException("El portero debe ir en la posición 0.");
			
		}
		
//		1: Lateral derecho.
		if(index != 1 && j instanceof Lateral && ((Lateral) j).getPuesto().equals(Puesto.DERECHO)) {
			
			throw new IllegalArgumentException("El lateral derecho debe ir en la posición 1.");
			
		}
		
//		2, 3. Centrales.
		if(index != 2 && index != 3 && j instanceof Central) {
			
			throw new IllegalArgumentException("El central debe ir en la posición 2 o 3.");
			
		}
		
//		4. Lateral izquierdo.
//		5, 6. Pivotes.
//		7. Mediapunta.
//		8. Extremo derecho.
//		9. Extremo izquierdo.
//		10. Delantero centro.

		this.jugadores.set(index, j);
		
	}
	
	public void mostrarAlineacion() {
		
		if(this.jugadores.size() != 11) {
			
			throw new IllegalArgumentException("La alineación no contiene 11 jugadores.");
			
		}
		
		System.out.println("----------ALINEACIÓN----------");
		
		for(Jugador j : this.jugadores) {
			
			System.out.println(j);
			
		}
		
	}
	
	public void mostrarDatosJugadores() {
		
		for(Jugador j : this.jugadores) {
			
			j.mostrarDatos();
			
		}
		
	}
	
	
}
