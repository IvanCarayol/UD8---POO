
public class Persona {
	
	// Crea una constante
	static final char sexoPorDefecto = 'H';
	
	private String nombre = "";
	private int edad = 0;
	private String DNI = "";
	private char sexo = sexoPorDefecto;
	private double peso = 0;
	private double altura = 0;
	

	public Persona() {

	}


	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

	}

	
	public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}

