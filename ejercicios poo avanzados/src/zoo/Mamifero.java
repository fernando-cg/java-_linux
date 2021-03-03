package zoo;

public class Mamifero extends Vertebrado {

	private int id ;
	
	private int Npatas ;
	
	private static int idNext = 1 ;
	
	public Mamifero(double peso, double altura, String nombre, String habitat, int Npatas) {
		super(peso, altura, nombre, habitat);
		
		this.Npatas = Npatas ;
		
		idNext ++ ;
		
	}

}
