package sprint2;

import java.util.Scanner;

import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Tempete extends ConsequenceAlea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) {
		System.out.println(Texts.getAleaTempete());

		System.out.println("Voulez-vous rentrer vos moutons dans la bergerie ?\n" + "1- Oui\n" + "2- Non\n");
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
		while (!res.matches("[1-2]")) {
			res = sc.nextLine();
		}
		sc.close();
		if (res.equals("2") || b.getJaugeFatigue() < 5) {
			int nbMoutonMort = moutons.getNbMouton() / 33;
			System.out.println("Mince, vous n'avez pas réussi à sauver tous les moutons !\n" + nbMoutonMort
					+ " mouton(s) est/sont mort(s) dans la tempête...");
			moutons.setNbMouton(moutons.getNbMouton() - nbMoutonMort);
			if (moutons.getNbMalade() > moutons.getNbMouton()) {
				moutons.setNbMalade(moutons.getNbMouton());
			}
		}else {
			int fatigue = b.getJaugeFatigue()-5;
			System.out.println("Votre jauge de fatigue passe a "+fatigue);
			b.setJaugeFatigue(fatigue);
		}
	}
	
}