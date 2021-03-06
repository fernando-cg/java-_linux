package entregable;

public class Producto {
	
	private int codigo ;
	
	private String titulo ;
	
	private String genero ;
	
	private int edadRecomendada;
	
	private double precio ;
	
	private boolean disponible ;
	
	private int cantidadDisponible ;

	public Producto(int codigo, String titulo, String genero, int edadRecomendada, double precio, boolean disponible,
			int cantidadDisponible) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.edadRecomendada = edadRecomendada;
		this.precio = precio;
		this.disponible = disponible;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getTitulo() {
		return titulo;
	}
	
	
	
	
}
