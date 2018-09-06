package SauteMouton;

import Game.Alea;
import Game.Berger;
import Game.Texts;
import Game.TroupeauMouton;

public class SauteMouton implements Alea{

	private JeuMouton jeu;

	public SauteMouton() {
		jeu = new JeuMouton(7);
	}
	
	private void afficheJeu() {
		String moutons = "";
		for (int i = 0; i < jeu.jeu.length; i++) {
			if (jeu.jeu[i] == Case.VIDE) {
				moutons += "        ";
			} else if (jeu.jeu[i] == Case.DROIT) {
				moutons += "  ,---@> ";
			} else {
				moutons += " <@---.  ";
			}
		}
		moutons += "\n";
		for (int i = 0; i < jeu.jeu.length; i++) {
			if (jeu.jeu[i] == Case.VIDE) {
				moutons += " _______ ";
			} else if (jeu.jeu[i] == Case.DROIT) {
				moutons += "    W-W' ";
			} else {
				moutons += " 'W-W    ";
				;
			}
		}
		moutons += "\n\n";
		for (int i = 0; i < jeu.jeu.length; i++) {
			moutons += "    " + i + "    ";
		}
		System.out.println(moutons);
	}

	private void run() {
		JoueurHumain pedro = new JoueurHumain();
		while (!jeu.gagnant() && !jeu.perdant()) {
			afficheJeu();
			jeu.executer(pedro.coupAJouer(jeu.coupsPossibles()));
		}
		if (jeu.gagnant()) {
			System.out.println("Vous avez gagné ");
		} else {
			System.out.println("Vous avez perdu");
		}
	}
	
	public boolean getGagnant() {
		return jeu.gagnant();
	}

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {
		System.out.println(Texts.getAleaSauteMouton());
		SauteMouton sm = new SauteMouton();
		sm.run();
		if (sm.getGagnant()) {
			System.out.println("Bravo, aucun mouton ne s'est échappé");
		}else {
			int nbMoutonEchappe = (int)(moutons.getNbMouton()* Math.random() / 5);
			if (nbMoutonEchappe == 0 ) {
				nbMoutonEchappe ++;
			}
			System.out.println("Oh non, "+nbMoutonEchappe+" mouton(s) se sont/ s'est echappé(s) !");
			moutons.setNbMouton(moutons.getNbMouton()-nbMoutonEchappe);
		}
	}
	
}
