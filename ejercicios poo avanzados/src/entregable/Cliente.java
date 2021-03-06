package entregable;
//automatizar las id con static
public class Cliente extends Usuario{
	
	private int id ;
	
	private int edad ;
	
	private void alquilarProducto() {
		
	}
	
	private void devolverProducto() {
		
	}

	public Cliente(String nombre, String dni, int telefono, String email, String direccion, int id, int edad) {
		super(nombre, dni, telefono, email, direccion);
		this.id = id;
		this.edad = edad;
	}
	
	
}	
