package sprint2;

import java.util.Random;
import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Maladie extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {
		System.out.println(Texts.getAleaMaladie());
		
		int nbNewMalade = (int)(moutons.getNbMouton()*(moutons.getNbMalade()*0.3));
	}

}
