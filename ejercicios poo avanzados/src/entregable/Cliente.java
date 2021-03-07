package entregable;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//automatizar las id con static
public class Cliente extends Usuario{
	
	private int id ;
	
	private int edad ;
	
	private static int idNext = 1;
	
	public ArrayList<Alquiler> alquilarProducto(ArrayList<Alquiler> alquileres,int empleado, int codigo) {
		
		
		alquileres.add(new Alquiler(id,empleado,codigo)) ;
		
		return alquileres;
	}
	
	
	public void devolverProducto(String titulo, ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos, ArrayList<Alquiler> alquileres) {
		
		int codigoalquiler = -1 ;
		
		for(int x = 0 ; x < peliculas.size() ; x++) {
			
			if(peliculas.get(x).getTitulo() == titulo) {
				
				codigoalquiler = peliculas.get(x).getCodigo() ;
				
				peliculas.get(x).setCantidadDisponible(peliculas.get(x).getCantidadDisponible()+1);
				
			}
		}
		
		if(codigoalquiler == -1) {
			for(int x = 0 ; x < juegos.size() ; x++) {
				
				if(juegos.get(x).getTitulo() == titulo) {
					
					codigoalquiler = juegos.get(x).getCodigo() ;
					juegos.get(x).setCantidadDisponible(juegos.get(x).getCantidadDisponible()+1);
					
				}
			}
		}
		
		for(int x = 0 ; x < alquileres.size() ; x++) {
			
			if(alquileres.get(x).getCodProducto() == codigoalquiler) {
				
				alquileres.remove(x) ;
				
			}
		}
		
		JOptionPane.showMessageDialog(null,"Operacion realizada") ;
	}

	public Cliente(String nombre, String dni, int telefono, String email, String direccion, int edad) {
		super(nombre, dni, telefono, email, direccion);
		id = idNext ;
		this.edad = edad;
		idNext++ ;
	}

	public int getId() {
		return id;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}	
