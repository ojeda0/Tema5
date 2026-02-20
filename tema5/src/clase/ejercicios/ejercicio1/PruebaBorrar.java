package clase.ejercicios.ejercicio1;

public class PruebaBorrar {

	public static void main(String[] args) {
		
		

	}
	
	public void verificarRequisitosVideojuego(String sistema, int ram, String grafica) {
	    boolean esSistemaCompatible = sistema.toUpperCase().contains("WINDOWS 11");
	    boolean tieneSuficienteMemoria = ram >= 16;
	    boolean tieneGraficaPotente = grafica.startsWith("RTX");

	    if (esSistemaCompatible && tieneSuficienteMemoria && tieneGraficaPotente) {
	        System.out.println("Puedes jugar en Ultra.");
	    }
	}
	
}
