package entregable;

public class Producto {
	
	private int codigo ;
	
	private String titulo ;
	
	private String genero ;
	
	private int edadRecomendada;
	
	private double precio ;
	
	
	private int cantidadDisponible ;

	public Producto(int codigo, String titulo, String genero, int edadRecomendada, double precio,
			int cantidadDisponible) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.edadRecomendada = edadRecomendada;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	
	
}
