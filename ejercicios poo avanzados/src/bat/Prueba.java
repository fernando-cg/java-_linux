package bat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba {

	@Test
	void testSuma() {
		
		int resultado = Calculadora.suma(2, 4) ;
		
		int esperado = 6 ;
		
		assertEquals(esperado, resultado) ;
	}
	
	@Test
	void testResta() {
		
		int resultado = Calculadora.resta(4, 2) ;
		
		int esperado = 2 ;
		
		assertEquals(esperado, resultado) ;
	}

}
