package SauteMouton;

import java.util.ArrayList;

public class JeuMouton {

	protected int idxVide;
	protected Case[] jeu;
	private final int SIZE;

	public JeuMouton(int sIZE) {
		if (sIZE > 0 && sIZE % 2 == 1) {
			SIZE = sIZE;
		} else {
			SIZE = 9;
		}
		jeu = new Case[SIZE];
		idxVide = SIZE / 2;
		for (int i = 0; i < jeu.length; i++) {
			if (i < idxVide) {
				jeu[i] = Case.DROIT;
			} else if (i == idxVide) {
				jeu[i] = Case.VIDE;
			} else {
				jeu[i] = Case.GAUCHE;
			}
		}
	}

	public ArrayList<Integer> coupsPossibles() {
		ArrayList<Integer> cpPossible = new ArrayList<Integer>();
		for (int i = 0; i < jeu.length; i++) {
			if (ok(i)) {
				cpPossible.add(i);
			}
		}
		return cpPossible;
	}

	public void executer(int coup) {
		idxVide = coup;
		if (jeu[coup] == Case.DROIT) {
			if (jeu[coup + 1] == Case.VIDE) {
				jeu[coup + 1] = Case.DROIT;
				jeu[coup] = Case.VIDE;
			} else {
				jeu[coup + 2] = Case.DROIT;
				jeu[coup] = Case.VIDE;
			}
		} else {
			if (jeu[coup - 1] == Case.VIDE) {
				jeu[coup - 1] = Case.GAUCHE;
				jeu[coup] = Case.VIDE;
			} else {
				jeu[coup - 2] = Case.GAUCHE;
				jeu[coup] = Case.VIDE;
			}
		}
	}

	private boolean ok(int coup) {
		if (jeu[coup] == Case.VIDE) {
			return false;
		}
		if (coup == jeu.length-1) {
			return false;
		}
		if (coup == jeu.length-2) {
			if (jeu[coup] == Case.DROIT && jeu[coup + 1] != Case.VIDE) {
				return false;
			}	
		}
		if (coup == 0) {
			return false;
		}
		if (coup == 1) {
			if (jeu[coup] == Case.GAUCHE && jeu[coup - 1] != Case.VIDE) {
				return false;
			}	
		}
		if (jeu[coup] == Case.DROIT && jeu[coup + 1] != Case.VIDE && jeu[coup + 2] != Case.VIDE) {
			return false;
		}
		if (jeu[coup] == Case.GAUCHE && jeu[coup - 1] != Case.VIDE && jeu[coup - 2] != Case.VIDE) {
			return false;
		}
		return true;
	}

	public boolean gagnant() {
		if (idxVide != SIZE / 2) {
			return false;
		}
		for (int i = 0; i < jeu.length / 2; i++) {
			if (jeu[i] != Case.GAUCHE) {
				return false;
			}
		}
		return true;
	}

	public Case getCase(int i) {
		if (i >= SIZE) {
			return null;
		}
		return jeu[i];
	}

	public boolean perdant() {
		return coupsPossibles().isEmpty();
	}

}
