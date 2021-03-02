package herenciasEJ2;

public class Comercial extends Empleado {

	private int ventas ;
	public Comercial(String nombre, int edad, int ventas) {
		super(nombre, edad);
		
		setSalario(ventas * 40) ;
		
		this.ventas = ventas ;
		
		if(edad>40 && ventas >4) {
			
			setPlus(300) ;
		}
	}
	
	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Comercial [ventas=" + ventas + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + "]";
	}
	
	

}
