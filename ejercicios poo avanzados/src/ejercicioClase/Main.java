package ejercicioClase;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Bus bus = new Bus(1,3,true);
		Tren tren = new Tren(100, "electrico") ;
		Coche coche = new Coche(5,"tesla","gr","blanco") ;
		Barco barco = new Barco(500,1) ;
		Avion avion = new Avion(18,4) ;
		
		ArrayList<Avion>  aviones  =  new  ArrayList<Avion> () ;
		ArrayList<Barco>  barcos  =  new  ArrayList<Barco> () ;
	
		System.out.println(bus.toString()) ;
		
		System.out.println(bus.velocidadMedia(920,bus.getTiempo()));
		
		System.out.println(tren.toString());
		
		System.out.println(tren.velocidadMedia(920, tren.getTiempo()));
		
		System.out.println(coche.toString());
		
		System.out.println(coche.velocidadMedia(920, coche.getTiempo()));
		
		System.out.println(barco.toString());
		
		System.out.println(barco.velocidadMedia(920, barco.getTiempo()));
		
		System.out.println(avion.toString());
		
		System.out.println(avion.velocidadMedia(920, avion.getTiempo()));
		
		String opciones[] = {"Introducir Aviones","Introducir Barcos","Introducir Coche", "Introducir Tren", "Introducir Bus" , "Ver datos","Salir"} ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione una opción?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[6]);
		
		switch (menu) {
		
		case 0:
			
			int capacidad = Integer.parseInt(JOptionPane.showInputDialog("introduzca la capacidad del Avión"));
			int nmotores = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de motores"));
			aviones.add(new Avion(capacidad,nmotores));
			
			break;

		case 1:
			
			int capacidad1 = Integer.parseInt(JOptionPane.showInputDialog("introduzca la capacidad del Barco"));
			int categoria = Integer.parseInt(JOptionPane.showInputDialog("introduzca la categoria del Barco"));
			barcos.add(new Barco(capacidad1,categoria));
			
			break;

			
		}
	}

}
