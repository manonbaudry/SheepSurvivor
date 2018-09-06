package Game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Game.Berger;
import Game.TroupeauMouton;
import SauteMouton.SauteMouton;

class TestSauteMouton {

	@Test
	void test() {
		SauteMouton sm = new SauteMouton();
		sm.effectuerAlea(new TroupeauMouton(50), new Berger(""));
		System.out.println(sm.getGagnant());
	}

}

