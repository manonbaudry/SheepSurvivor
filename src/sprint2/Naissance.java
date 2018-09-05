package sprint2;

import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Naissance extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {
		int naissance = (moutons.getNbMouton()-moutons.getNbMalade())/10;
		moutons.setNbMouton(moutons.getNbMouton()+naissance);
		System.out.println(Texts.getAleaNaissance(naissance));
	}

}
