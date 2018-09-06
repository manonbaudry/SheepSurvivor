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
			MonAlea alea = new MonAlea();
			alea.tirage(p.getTroupeau(), p.getB());
			p.incrementeCompteur();
			p.variationFaimMouton();
			p.finPartie();
			Util.delay();
		}

		
		

	}

}
