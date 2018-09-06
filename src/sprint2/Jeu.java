/**
 * Groupe 9
 * 05/09/2018
 */
package sprint2;
import sprint3.Util;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

import sprint1.Alea;
import sprint1.Berger;
import sprint1.Partie;
import sprint1.Texts;
import sprint1.TroupeauMouton;

/**
 * @author baudrym
 *
 */
public class Jeu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//intro
		System.out.println(Texts.moutonIntro());
		System.out.println(Texts.getIntro());
		System.out.println(Texts.getRegles());
		
		
		
		Partie p = new Partie(new Berger(Partie.saisieNom()), new TroupeauMouton(30));
		while(! p.isFinPartie()) {
			Util.cls();
			p.afichageDonnees();
			if (p.getTroupeau().isEstDansGrange()) {
				System.out.println("Voulez-vous sortir les moutons dans le pré ?\n"
						+ "1- Oui\n"
						+ "2- Non\n");
				Scanner sc = new Scanner(System.in);
				String res = sc.nextLine();
				while (!res.matches("[1-2]")) {
					res = sc.nextLine();
				}
				if (res.equals("1")) {
					p.getTroupeau().setEstDansGrange(false);
				}
			}
			if (p.getTroupeau().getNbMalade() >  0) {
				p.getTroupeau().setNbMalade(p.getTroupeau().getNbMalade() + (int)(Math.random()*(p.getTroupeau().getNbMouton()-p.getTroupeau().getNbMalade()) / 3));
				System.out.println("La maladie s'est propagée ! Il y a désormais " + p.getTroupeau().getNbMalade() + " moutons malades.");
				if (p.getB().getJaugeFatigue() >= 5) {
					System.out.println("Voulez-vous abattre les moutons malades ? 1-oui, 2-non");
					Scanner sc = new Scanner(System.in);
					String rep = "";
					while (! rep.matches("[1-2]")) {
						rep = sc.nextLine();
					}
					if (rep.equals("1")) {
						System.out.println("Vous avez abattu les " + p.getTroupeau().getNbMalade() + " moutons malades.");
						p.getB().setJaugeFatigue(p.getB().getJaugeFatigue()-2);
						p.getTroupeau().setNbMouton(p.getTroupeau().getNbMouton()-p.getTroupeau().getNbMalade());
						p.getTroupeau().setNbMalade(0);
					}
				}else {
					
				}
			}
			MonAlea alea = new MonAlea();
			alea.tirage(p.getTroupeau(), p.getB());
			p.incrementeCompteur();
			p.variationFaimMouton();
			p.finPartie();
			Util.delay();
		}

		
		

	}

}
