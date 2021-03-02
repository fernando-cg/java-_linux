package zoo;

public class Zoologico {

	private int identificador ;
	
	private double peso ;
	
	private double altura ;
	
	private String nombre ;
	
	private String habitat ;
	
	private static int idNext = 1 ;

	public Zoologico(double peso, double altura, String nombre, String habitat) {
		this.peso = peso;
		this.altura = altura;
		this.nombre = nombre;
		this.habitat = habitat;
		identificador = idNext ;
		
		idNext ++ ;
	}
	
	
}
