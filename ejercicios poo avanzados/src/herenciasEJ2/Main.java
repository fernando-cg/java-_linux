package herenciasEJ2;

public class Main {

	public static void main(String[] args) {
		
		Comercial com = new Comercial("pepe",50,5) ;
		
		Repartidor rep = new Repartidor("pepe",50,3,6) ;

		
		System.out.println(com.toString()) ;
		
		System.out.println(rep.toString());
	}

}
