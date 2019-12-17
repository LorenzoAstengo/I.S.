package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Euro;

class TestEuro {

	@Test
	void testCostructor1WithZeros() {
		var eur=new Euro(0, 0);
		assertTrue(eur.getValore()==0);
	}
	
	@Test
	void testCostructor1WithValue() {
		var eur=new Euro(3, 50);
		assertTrue(eur.getValore()==350);
	}
	
	@Test
	void testCostructor2WithZeros() {
		var eur=new Euro(0);
		assertTrue(eur.getValore()==0);
	}
	
	@Test
	void testCostructor2WithValue() {
		var eur=new Euro(8,50);
		assertTrue(eur.getValore()==850);
	}
	
	@Test
	void testSum() {
		var eur1=new Euro(3);
		var eur2=new Euro(100,35);
		assertTrue((eur1.somma(eur2)).getValore()==10335);
	}
	
	@Test
	void testDiff() {
		var eur1=new Euro(100);
		var eur2=new Euro(3);
		eur1.sottrai(eur2);
		assertTrue(eur1.getValore()==9700);
	}
	
	@Test
	void testEqual() {
		var eur1=new Euro(100,35);
		var eur2=new Euro(100,35);
		assertTrue(eur1.ugualeA(eur2));
	}
	
	@Test
	void testLessThen() {
		var eur1=new Euro(100);
		var eur2=new Euro(100,35);
		assertTrue(eur1.minoreDi(eur2));
	}
	
	@Test
	void testPrint() {
		var eur1=new Euro(100,35);
		assertEquals(eur1.stampa(),"100.35 euro");
	}

}
