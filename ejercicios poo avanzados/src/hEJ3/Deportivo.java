package hEJ3;

public class Deportivo extends Coche{

		private int caballos ;

		public Deportivo(String nombre, int pasajeros, int velocidad, float precio, int puertas, String color,
				String marca, String modelo, int caballos) {
			super(nombre, pasajeros, velocidad, precio, puertas, color, marca, modelo);
			this.caballos = caballos;
		}

		@Override
		public String toString() {
			return "Deportivo [caballos=" + caballos + ", toString()=" + super.toString() + ", getNombre()="
					+ getNombre() + ", getPasajeros()=" + getPasajeros() + ", getVelocidad()=" + getVelocidad()
					+ ", getPrecio()=" + getPrecio() + "]";
		}
		
		
}
