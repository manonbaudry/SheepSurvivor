package Game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Game.SauteMouton;

class TestSauteMouton {

	@Test
	void test() {
		SauteMouton sm = new SauteMouton();
		assertFalse(sm.bloque());
		assertFalse(sm.gagnant());
		assertTrue(sm.deplacement(2));
	}

}
