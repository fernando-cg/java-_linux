package zoo;

public class Peces extends Vertebrado {

	private boolean domestico ;
	
	private int Naletas ;
	
	private String tipoAgua ;

	public Peces(double peso, double altura, String nombre, String habitat, boolean domestico, int naletas,
			String tipoAgua) {
		super(peso, altura, nombre, habitat);
		this.domestico = domestico;
		Naletas = naletas;
		this.tipoAgua = tipoAgua;
	}
	
	
	
}
