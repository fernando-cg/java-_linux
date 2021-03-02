package herenciasEJ2;

public class Repartidor extends Empleado {

	private int zona ;
	
	private int entregas ;
	
	public Repartidor(String nombre, int edad, int zona , int entregas) {
		
		super(nombre, edad);
		
		setSalario(entregas*12) ;
		
		this.zona = zona ;
		
		this.entregas = entregas ;
		
		if((zona == 2 || zona== 3) && edad>30 && entregas >5) {
			
			setPlus(300) ;
		}
		
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getEntregas() {
		return entregas;
	}

	public void setEntregas(int entregas) {
		this.entregas = entregas;
	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", entregas=" + entregas + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + "]";
	}
	
	
	
	

}
