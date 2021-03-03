package zoo;

public class Reptiles extends Vertebrado{
	
	private boolean venenoso ;
	
	private int npatas ;

	public Reptiles(double peso, double altura, String nombre, String habitat, boolean venenoso, int npatas) {
		super(peso, altura, nombre, habitat);
		
		this.venenoso = venenoso;
		this.npatas = npatas;
	}

}
