package clase.ejercicios.ejercicioPadel.instalaciones.pista;

public class Pista implements Reservable {

	//ATRIBUTOS
	private int numPista;
	private TipoPista tipo;
	private UbicacionPista ubicacion;
	private boolean reservada;
	
	//CONSTRUCTOR
	public Pista(int numPista, String tipo, String ubicacion) {
		this.setNumPista(numPista);
		this.setTipo(tipo);
		this.setUbicacion(ubicacion);
	}

	//GETTERS Y SETTERS
	public int getNumPista() {
		return numPista;
	}

	public void setNumPista(int numPista) {
		
		if(numPista < 0) {
			
			throw new IllegalArgumentException("ERROR. El número de pista debe ser un número entero positivo.");
			
		}
		
		this.numPista = numPista;
		
	}

	public String getTipo() {
		return tipo.toString();
	}

	public void setTipo(String tipo) {
		this.tipo = TipoPista.valueOf(tipo.toUpperCase());
	}

	public String getUbicacion() {
		return ubicacion.toString();
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = UbicacionPista.valueOf(ubicacion.toUpperCase());
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
		Pista other = (Pista) obj;
		return this.numPista == other.numPista &&
				this.tipo.equals(other.tipo) &&
				this.ubicacion.equals(other.ubicacion);
	}

	@Override
	public String toString() {
		return String.format("Pista [numPista = %d, tipo = %s, ubicacion = %s]", this.numPista, this.tipo.toString(), this.ubicacion.toString());
	}

	@Override
	public void reservar() {
		
		if(this.reservada) {
			
			throw new IllegalArgumentException("ERROR. La pista ya está reservada.");
			
		}
		
		this.reservada = true;
		
	}

	@Override
	public void anular() {
		
		if(!this.reservada) {
			
			throw new IllegalArgumentException("ERROR. La pista aún no ha sido reservada.");
			
		}
		
		this.reservada = false;
		
	}
	
	
}
