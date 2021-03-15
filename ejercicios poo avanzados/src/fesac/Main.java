package fesac;

public class Main {

	public static void main(String[] args) {

		 Profesor p1 = new Profesor("Ramon","rossa") ;
		 Administrativo a1 = new Administrativo("pepe","rossa") ;
		 Director d1 = new Director("uno","Dos") ;
		
		System.out.println(p1.getSueldo());
		System.out.println(a1.getSueldo());
		System.out.println(d1.getSueldo());
	}

}
