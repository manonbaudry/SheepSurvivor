package sprint1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import sprint1.TroupeauMouton;

class TestTroupeau {

	@Test
	void test() {
		TroupeauMouton tm = new TroupeauMouton(10);
		assertEquals(10, tm.getNbMouton());
		assertEquals(0, tm.getNbMalade());
	}

}
