package entregable;

public class Juego extends Producto {

	private int anioLanzamiento ;
	
	private String plataforma ;
	
	private boolean multijugador ;

	public Juego(int codigo, String titulo, String genero, int edadRecomendada, double precio,
			int cantidadDisponible, int anioLanzamiento, String plataforma, boolean multijugador) {
		super(codigo, titulo, genero, edadRecomendada, precio, cantidadDisponible);
		this.anioLanzamiento = anioLanzamiento;
		this.plataforma = plataforma;
		this.multijugador = multijugador;
	}

	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}
	
}
