package entregable;

public class Juego extends Producto {

	private int anioLanzamiento ;
	
	private String plataforma ;
	
	private boolean multijugador ;

	public Juego(int codigo, String titulo, String genero, int edadRecomendada, double precio, boolean disponible,
			int cantidadDisponible, int anioLanzamiento, String plataforma, boolean multijugador) {
		super(codigo, titulo, genero, edadRecomendada, precio, disponible, cantidadDisponible);
		this.anioLanzamiento = anioLanzamiento;
		this.plataforma = plataforma;
		this.multijugador = multijugador;
	}
	
}
