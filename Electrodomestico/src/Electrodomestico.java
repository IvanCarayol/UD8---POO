
public class Electrodomestico {

	static final double precioBasePorDefecto = 100;
	static final String colorPorDefecto = "Blanco";
	static final char consumoEnergeticoPorDefecto = 'F';
	static final double pesoPorDefecto = 5;

	private double precioBase = precioBasePorDefecto;
	private String color = colorPorDefecto;
	private char consumoEnergetico = consumoEnergeticoPorDefecto;
	private double peso = pesoPorDefecto;


	public Electrodomestico() {

	}


	public Electrodomestico(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}


	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {

		this.precioBase = precioBase;

		// Comprobamos que el color este entre los que tenemos
		if (comprobarcolor(color)) {
			this.color = color;
		}

		// Comprobamos que la letra no este fuera de rango
		if (comprobarLetraConsumo(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}

		this.peso = peso;
	}
	
	
	
	
	


	@Override
	public String toString() {
		return "Precio Base: " + precioBase + "\nColor: " + color + "\nConsumo Energetico: " + consumoEnergetico + "\nPeso: " + peso;
	}


	private static boolean comprobarcolor(String color) {

		String[] ArrayColores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

		for (int i = 0; i < ArrayColores.length; i++) {

			// Comprobamos que este el color insertado
			if (color.equalsIgnoreCase(ArrayColores[i])) {
				return true;
			}
		}


		return false;
	}


	private static boolean comprobarLetraConsumo(char letra) {

		char[] ArrayLetrasMayusucals = {'A', 'B', 'C', 'D', 'E', 'F'};
		char[] ArrayLetrasMinuscilas = {'a', 'b', 'c', 'd', 'e', 'f'};

		for (int i = 0; i < ArrayLetrasMayusucals.length; i++) {

			// Comprobamos que este el color insertado
			if (letra == ArrayLetrasMayusucals[i] || letra == ArrayLetrasMinuscilas[i]) {
				return true;
			}
		}


		return false;
	}

}
