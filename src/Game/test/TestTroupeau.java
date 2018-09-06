package Game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Game.TroupeauMouton;

class TestTroupeau {

	@Test
	void test() {
		TroupeauMouton tm = new TroupeauMouton(10);
		assertEquals(10, tm.getNbMouton());
		assertEquals(0, tm.getNbMalade());
	}

}
