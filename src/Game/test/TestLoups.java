package Game.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Game.Alea;
import Game.Berger;
import Game.Loups;
import Game.TroupeauMouton;

class TestLoups {

	@Test
	void test() {
		TroupeauMouton tm = new TroupeauMouton(50);
		Berger b = new Berger("");
		Alea ca = new Loups();
		ca.effectuerAlea(tm, b);
	}

}
