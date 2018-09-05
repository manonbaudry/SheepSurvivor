package sprint2;

import java.util.Scanner;

import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Loups extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) {
		System.out.println(Texts.getAleaLoups());

		System.out.println("Voulez-vous rentrer vos moutons dans la bergerie ?\n" + "1- Oui\n" + "2- Non\n");
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
		while (!res.matches("[1-2]")) {
			res = sc.nextLine();
		}
		sc.close();
		if (res.equals("2")) {
			System.out.println("Voulez-vous pourchassez les loups pour esperer sauvez des moutons ?\n" + "1- Oui\n" + "2- Non\n");
			Scanner sc2 = new Scanner(System.in);
			String res2 = sc.nextLine();
			while (!res2.matches("[1-2]")) {
				res2 = sc2.nextLine();
			}
			sc2.close();
			if (res2.equals("2")) {
				int nbMoutonMort = moutons.getNbMouton() / 20;
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
		}
	}

}
