package Game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Game.Berger;
import Game.ConsequenceAlea;
import Game.Loups;
import Game.TroupeauMouton;
import javafx.scene.media.Track;

class TestLoups {

	@Test
	void test() {
		TroupeauMouton tm = new TroupeauMouton(50);
		Berger b = new Berger("");
		ConsequenceAlea ca = new Loups();
		ca.effectuerAlea(tm, b);
	}

}
