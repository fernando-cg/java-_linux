package cash;

import java.util.Comparator;

public class CompararFecha implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		if(o1.getMilisec() < o2.getMilisec()) {
			
			return -1 ;
		}
		else if (o1.getMilisec() < o2.getMilisec()) {
			
			return 0 ;
		}
		else {
			return 1 ;
		}
	}

}
