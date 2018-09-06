package SauteMouton;

public class SauteMouton {

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
			System.out.println("T'as gagné ");
		} else {
			System.out.println("T'as perdu");
		}
	}

	public static void main(String[] args) {
		SauteMouton sm = new SauteMouton();
		sm.run();
	}

}
