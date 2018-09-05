package sprint2;

import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Loups extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons) {
		System.out.println(Texts.getAleaLoups());
		int nbMoutonMort = moutons.getNbMouton() / 20;
		System.out.println("Les loups ont réussi à dévorer " + nbMoutonMort + " délicieux moutons...");
		moutons.setNbMouton(moutons.getNbMouton()- nbMoutonMort);
		if (moutons.getNbMalade() > moutons.getNbMouton()) {
			moutons.setNbMalade(moutons.getNbMouton());
		}
	}
	

}
