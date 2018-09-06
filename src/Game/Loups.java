package Game;

import java.util.Scanner;

public class Loups extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) {
		System.out.println(Texts.getAleaLoups());
		if (!moutons.isEstDansGrange()) {
			System.out.println("Voulez-vous rentrer vos moutons dans la bergerie ?\n" + "1- Oui\n" + "2- Non\n");
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
			while (!res.matches("[1-2]")) {
				res = sc.nextLine();
			}
			if (res.equals("2") || b.getJaugeFatigue() < 3) {
				System.out.println("Voulez-vous pourchassez les loups pour esperer sauvez des moutons ?\n" + "1- Oui\n"
						+ "2- Non\n");
				String res2 = sc.nextLine();
				while (!res2.matches("[1-2]")) {
					res2 = sc.nextLine();
				}
				if (res2.equals("2") || b.getJaugeFatigue() < 4) {
					int nbMoutonMort = (int) (moutons.getNbMouton() * (Math.random() / 4));
					System.out.println("Les loups ont réussi à dévorer " + nbMoutonMort + " délicieu(x) mouton(s)...");
					moutons.setNbMouton(moutons.getNbMouton() - nbMoutonMort);
					if (moutons.getNbMalade() > moutons.getNbMouton()) {
						moutons.setNbMalade(moutons.getNbMouton());
					}
				} else {
					int fatigue = b.getJaugeFatigue() - 4;
					System.out.println("Votre jauge de fatigue passe a " + fatigue);
					b.setJaugeFatigue(fatigue);
				}
			} else {
				int fatigue = b.getJaugeFatigue() - 3;
				System.out.println("Votre jauge de fatigue passe a " + fatigue);
				b.setJaugeFatigue(fatigue);
				moutons.setEstDansGrange(true);
			}
		} else {
			System.out.println("Vous êtes protégés, vos moutons sont déjà dans la grange");
		}

	}

	public static void main(String[] args) {
		TroupeauMouton moutons = new TroupeauMouton(50);
		moutons.setEstDansGrange(true);
		Berger b = new Berger("");
		ConsequenceAlea ca = new Loups();
		ca.effectuerAlea(moutons, b);
	}

}
