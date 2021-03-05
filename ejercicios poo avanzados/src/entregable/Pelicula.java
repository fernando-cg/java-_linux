package entregable;

public class Pelicula extends Producto {
	
	private String duracion ;
	
	private String idioma ;

	public Pelicula(int codigo, String titulo, String genero, int edadRecomendada, double precio, boolean disponible,
			int cantidadDisponible, String duracion, String idioma) {
		super(codigo, titulo, genero, edadRecomendada, precio, disponible, cantidadDisponible);
		this.duracion = duracion;
		this.idioma = idioma;
	}
	
	
}
