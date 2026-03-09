package documentacion.convenio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import documentacion.empresa.Empresa;
import personas.alumno.Alumno;
import personas.tutor.tutorDocente.TutorDocente;
import personas.tutor.tutorLaboral.TutorLaboral;

public class Convenio {

	//ATRIBUTOS
	private static int contadorCodigo = 1;
	
	private int codigo;
	private Empresa empresa;
	private int numAlumnos;
	private List<Alumno> alumnado;
	private LocalDateTime firmaLaboral;
	private LocalDateTime firmaDocente;
	private TutorLaboral tutorLaboral;
	private TutorDocente tutorDocente;
	
	//CONSTRUCTOR
	public Convenio(Empresa empresa, int numAlumnos) {
		this.codigo = Convenio.contadorCodigo++;
		
		this.empresa = empresa;
		this.setNumAlumnos(numAlumnos);
		
		this.alumnado = new ArrayList<>();
		this.firmaLaboral = null;
		this.firmaDocente = null;
		this.tutorLaboral = null;
		this.tutorDocente = null;
	}

	//GETTERS Y SETTERS
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		
		int trabajadoresNecesarios = numAlumnos * 2;
		
		if(this.empresa.getNumTrabajadores() < trabajadoresNecesarios) {
			
			throw new IllegalArgumentException("ERROR. Debe haber al menos 2 empleados por cada alumno que asignemos.");
			
		}
		
		this.numAlumnos = numAlumnos;
	}

	public List<Alumno> getAlumnado() {
		return alumnado;
	}

	public void setAlumnado(List<Alumno> alumnado) {
		this.alumnado = alumnado;
	}

	public LocalDateTime getFirmaLaboral() {
		return firmaLaboral;
	}

	public void setFirmaLaboral(LocalDateTime firmaLaboral) {
		this.firmaLaboral = firmaLaboral;
	}

	public LocalDateTime getFirmaDocente() {
		return firmaDocente;
	}

	public void setFirmaDocente(LocalDateTime firmaDocente) {
		this.firmaDocente = firmaDocente;
	}

	public TutorLaboral getTutorLaboral() {
		return tutorLaboral;
	}

	public void setTutorLaboral(TutorLaboral tutorLaboral) {
		this.tutorLaboral = tutorLaboral;
	}

	public TutorDocente getTutorDocente() {
		return tutorDocente;
	}

	public void setTutorDocente(TutorDocente tutorDocente) {
		this.tutorDocente = tutorDocente;
	}

	public int getCodigo() {
		return codigo;
	}
	
	//MÉTODOS
	public void incluirAlumno(Alumno alumno) {
		
		if(this.firmaDocente != null || this.firmaLaboral != null) {
			
			throw new IllegalArgumentException("ERROR. El convenio ya está firmado y no se puede modificar.");
			
		}
		
		if(this.alumnado.size() >= this.getNumAlumnos()) {
			
			throw new IllegalArgumentException("ERROR. No quedan plazas en el convenio.");
			
		}
		
		if(this.alumnado.contains(alumno)) {
			
			throw new IllegalArgumentException("ERROR. El alumno ya está asociado.");
			
		}
		
		alumnado.add(alumno);
		
	}
	
	public void retirarAlumno(int posicion) {
		
		if(this.firmaDocente != null || this.firmaLaboral != null) {
			
			throw new IllegalArgumentException("ERROR. El convenio ya está firmado y no se puede modificar.");
			
		}
		
		if(posicion >= this.alumnado.size() || posicion < 0) {
			
			throw new IllegalArgumentException("ERROR. La posición se encuentra fuera de la lista.");
			
		}
		
		this.alumnado.remove(posicion);
		
	}
	
	public boolean completo() {
		
		return this.alumnado.size() == this.numAlumnos;
		
	}
	
	public void firmar(TutorLaboral tutorLaboral) {
		
		if(this.firmaLaboral != null) {
			
			throw new IllegalArgumentException("ERROR. Un tutor laboral ya ha firmado este convenio.");
			
		}
		
		if(!this.completo()) {
			
			throw new IllegalArgumentException("ERROR. Faltan alumnos por asignar.");
			
		}
		
		this.tutorLaboral = tutorLaboral;
		this.firmaLaboral = LocalDateTime.now();
		
	}
	
	public void firmar(TutorDocente tutorDocente) {
		
		if(this.firmaDocente != null) {
			
			throw new IllegalArgumentException("ERROR. Un tutor docente ya ha firmado este convenio.");
			
		}
		
		if(!this.completo()) {
			
			throw new IllegalArgumentException("ERROR. Faltan alumnos por asignar.");
			
		}
		
		this.tutorDocente = tutorDocente;
		this.firmaDocente = LocalDateTime.now();
		
	}
	
	public void resumen() {
		
		String estado = "PENDIENTE";
		
		if(this.firmaLaboral != null && this.firmaDocente != null) {
			
			estado = "FIRMADO";
			
		}
		
		System.out.printf("Estado: %s\n"
				+ "Alumnos: %d\n", estado, this.alumnado.size());
		
		for(Alumno a : this.alumnado) {
			
			System.out.printf("- %s, %s\n", a.getApellidos(), a.getNombre());
			
		}
		
	}
	
}
