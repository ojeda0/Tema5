package documentacion.empresa;

public class Empresa implements Contratable, Comparable<Empresa>{

	//ATRIBUTOS
	private String nombre;
	private String cif;
	private int numTrabajadores;
	private String direccion;
	private String localidad;
	
	private static String cifUltimaEmpresaRegistrada;

	//CONSTRUCTOR
	public Empresa(String nombre, String cif, int numTrabajadores, String direccion, String localidad) {
		this.nombre = nombre;
		this.cif = cif;
		this.setNumTrabajadores(numTrabajadores);
		this.direccion = direccion;
		this.localidad = localidad;
		
		Empresa.cifUltimaEmpresaRegistrada = cif;
		
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		
		if(numTrabajadores < 2) {
			
			throw new IllegalArgumentException("ERROR. Las empresas deben tener al menos 2 trabajadores.");
			
		}
		
		this.numTrabajadores = numTrabajadores;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public static String getCifUltimaEmpresaRegistrada() {
		return Empresa.cifUltimaEmpresaRegistrada;
	}

	@Override
	public void contratar(int cantidad) {
		
		this.setNumTrabajadores(this.numTrabajadores + cantidad);
		
	}

	@Override
	public void despedir(int cantidad) {
		
		this.setNumTrabajadores(this.numTrabajadores - cantidad);
		
	}

	@Override
	public int compareTo(Empresa o) {
		
		int mayorMenor = Integer.compare(o.numTrabajadores, this.numTrabajadores);
		
		if(mayorMenor == 0) {
			
			return this.cif.compareTo(o.cif);
			
		}
		
		return mayorMenor;
		
	}
	
	
	
}
