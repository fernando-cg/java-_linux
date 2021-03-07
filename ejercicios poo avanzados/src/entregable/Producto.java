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

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
