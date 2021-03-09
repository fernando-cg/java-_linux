package ejercicioClase;

import java.util.Date;

public class Tierra extends Transporte {
	
	//metodos
	public Tierra(int capacidad) {
		super(capacidad);
	}

	@Override
	public String toString() {
		return "Tierra ->" + super.toString();
	}
	
	
}
