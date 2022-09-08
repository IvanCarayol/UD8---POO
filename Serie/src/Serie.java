
public class Serie {
	
	private String titulo = "";
	private int numeroDeTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";


	public Serie() {

	}


	public Serie(String titulo, String creador) {
	
		this.titulo = titulo;
		this.creador = creador;
	}


	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
}
