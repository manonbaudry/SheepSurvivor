package Game;

import java.util.Scanner;

public class Tempete implements Alea  {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) {
		System.out.println(Texts.getAleaTempete());

		if (!moutons.isEstDansGrange()) {
			System.out.println("Voulez-vous rentrer vos moutons dans la bergerie ?(-5 pt)\n" + "1- Oui\n" + "2- Non\n");
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
			while (!res.matches("[1-2]")) {
				res = sc.nextLine();
			}
			if (res.equals("2") || b.getJaugeFatigue() < 5) {
				int nbMoutonMort = (int) (moutons.getNbMouton() * (Math.random() / 3));
				if (nbMoutonMort == 0) {
					nbMoutonMort ++;
				}
				System.out.println("Mince, vous n'avez pas réussi à sauver tous les moutons !\n" + nbMoutonMort
						+ " mouton(s) est/sont mort(s) dans la tempête...");
				moutons.setNbMouton(moutons.getNbMouton() - nbMoutonMort);
				if (moutons.getNbMalade() > moutons.getNbMouton()) {
					moutons.setNbMalade(moutons.getNbMouton());
				}
			} else {
				int fatigue = b.getJaugeFatigue() - 5;
				System.out.println("Votre jauge de fatigue passe a " + fatigue);
				b.setJaugeFatigue(fatigue);
				moutons.setEstDansGrange(true);

			}

		} else {
			System.out.println("Ouf, vos moutons sont déjà à l'abri dans la bergerie.");
		}
	}

}