package zoo;

public class Ave extends Vertebrado {
	
	private double embergadura ;
	
	private boolean vuela ;
	
	public Ave(double peso, double altura, String nombre, String habitat, double embergadura, boolean vuela) {
		super(peso, altura, nombre, habitat);
		
		this.embergadura = embergadura  ;
		
		this.vuela = vuela ;
	}	

}
