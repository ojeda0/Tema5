package clase.ejercicios.ejercicio1;

public class PruebaBorrar {

	public static void main(String[] args) {
		
		

	}
	
	public void registrarNuevoUsuarioSistema(String correo, String clave) {
	    comprobarCredenciales(correo, clave);
	    almacenarRegistroEnBaseDatos(correo);
	    notificarBienvenida(correo);
	}

	private void comprobarCredenciales(String correo, String clave) {
	    if(!correo.contains("@") || clave.length() < 8) {
	        throw new IllegalArgumentException("Datos inválidos");
	    }
	}

	private void almacenarRegistroEnBaseDatos(String correo) {
	    System.out.println("Conectando a DB...");
	    System.out.println("Insertando registro: " + correo);
	}

	private void notificarBienvenida(String correo) {
	    System.out.println("Abriendo servidor SMTP...");
	    System.out.println("Enviando correo a " + correo);
	}
	
}
