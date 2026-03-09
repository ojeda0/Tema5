package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import documentacion.convenio.Convenio;
import documentacion.empresa.Empresa;
import personas.alumno.Alumno;
import personas.tutor.tutorDocente.TutorDocente;
import personas.tutor.tutorLaboral.ComparaLaborales;
import personas.tutor.tutorLaboral.TutorLaboral;

public class Main {

	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("Palmilla Tech", "B12345678", 10, "La Palmilla", "Málaga");
		Empresa e2 = new Empresa("Yasuo Tech", "B12345432", 5, "Toplane", "Grieta del Invocador");
		
		Alumno a1 = new Alumno("Juanito", "De la palmilla", "11111111A", 11123456);
		Alumno a2 = new Alumno("Isaac", "González", "45111111A", 87123456);
		Alumno a3 = new Alumno("Robe", "Fernández", "78111111A", 55123456);
		
		TutorLaboral tl1 = new TutorLaboral("Angelito", "García", "44444444D", "angelito@tech.com", "RESPONSABLE");
		TutorLaboral tl2 = new TutorLaboral("Jose", "Hernández", "44445644D", "jose@tech.com", "GERENTE");
		TutorDocente td1 = new TutorDocente("Manuelito", "López", "55555555E", "manuel@instituto.com", "SAI");
		TutorDocente td2 = new TutorDocente("Óscar", "Cañellas", "55548755E", "oscar@instituto.com", "PES");
		
		Convenio c1 = new Convenio(e1, 3);
		System.out.printf("Convenio número %d crado correctamente.\n", c1.getCodigo());
		
		c1.incluirAlumno(a1);
		c1.incluirAlumno(a2);
		c1.incluirAlumno(a3);
		
		c1.firmar(tl1);
		c1.firmar(td1);
		
		c1.resumen();
		
		List<Empresa> empresas = new ArrayList<Empresa>();
		empresas.add(e1);
		empresas.add(e2);
		
		List<TutorLaboral> tutoresLaborales = new ArrayList<TutorLaboral>();
		tutoresLaborales.add(tl1);
		tutoresLaborales.add(tl2);
		
		System.out.println(tutoresLaborales);
		
		Collections.sort(tutoresLaborales, new ComparaLaborales());
		
		System.out.println(tutoresLaborales);
		
		System.out.println(empresas);
		
		Collections.sort(empresas);
		
		System.out.println(empresas);
		
		a1.saludar();
		tl1.saludar();
		td1.saludar();
		td2.saludar();
		
	}

}
