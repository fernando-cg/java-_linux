package zoo;

public class Invertebrado extends Zoologico{

	private int id ;
	
	private static int idNext = 1 ;
	
	private String especie ;
	
	private String alimentacion ;
	
	private int npatas ;

	public Invertebrado(double peso, double altura, String nombre, String habitat, String especie, String alimentacion,
			int npatas) {
		super(peso, altura, nombre, habitat);
		this.especie = especie;
		this.alimentacion = alimentacion;
		this.npatas = npatas;
		id = idNext ;
		
		idNext ++ ;
	}


	
}
