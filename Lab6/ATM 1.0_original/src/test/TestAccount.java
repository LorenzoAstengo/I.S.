package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.BankDatabase;
import code.Euro;

class TestAccount {
	
	BankDatabase BD;

	private Euro toEuro(Euro d) {
		return (d);
	}

	@BeforeEach
	protected void setUp() {
		BD= new BankDatabase();
	}
	
	@Test
	void testAvaibleBalance() {
		assertTrue(toEuro(BD.getAvailableBalance(12345)).ugualeA(new Euro(1000)));
	}
	
	@Test
	void testTotalBalance() {
		assertTrue(toEuro(BD.getTotalBalance(12345)).ugualeA(new Euro(1200)));
	}
	
	@Test
	void testCredit() {
		BD.credit(12345, new Euro(200));
		assertTrue(toEuro(BD.getTotalBalance(12345)).ugualeA(new Euro(1400)));
	}
	
	@Test
	void testDebit() {
		BD.debit(12345, new Euro(200));
		assertTrue(toEuro(BD.getAvailableBalance(12345)).ugualeA(new Euro(800)));
		assertTrue(toEuro(BD.getTotalBalance(12345)).ugualeA(new Euro(1000)));
	}

}
