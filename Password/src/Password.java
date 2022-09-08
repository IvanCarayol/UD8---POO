
public class Password {
	
	private int longitud = 8;
	private String contrasenia;
	

	public Password() {

	}

	public Password(int longitud) {
		
		this.longitud = longitud;
		
		// Guardamos los caracteres para usar en la contraseña
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		// variable para ir guardando la contraseña
		String AuxContrasenia = "";
		
		for (int i = 0; i < longitud; i++) {

			int numeroAleatorio = (int) Math.floor(Math.random()*caracteres.length());

			AuxContrasenia += caracteres.charAt(numeroAleatorio);


		}
		
		this.contrasenia = AuxContrasenia;

	}

	@Override
	public String toString() {
		return "Longitud: " + longitud + "\nContrasenia: " + contrasenia;
	}
	
	

}
