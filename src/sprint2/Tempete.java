package sprint2;

import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Tempete extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) { 
		System.out.println(Texts.getAleaTempete());
		int nbMoutonMort = moutons.getNbMouton() / 33;
		System.out.println("Mince, vous n'avez pas réussi à sauver tous les moutons !\n"
				+ nbMoutonMort + " moutons sont morts dans la tempête...");
		moutons.setNbMouton(moutons.getNbMouton()- nbMoutonMort);
		if (moutons.getNbMalade() > moutons.getNbMouton()) {
			moutons.setNbMalade(moutons.getNbMouton());
		}
	}
	

}