/**
 * Groupe 9
 * 05/09/2018
 */
package Game;

import java.util.Scanner;

/**
 * @author baudrym
 *
 */
public class Jeu {

	public void menu() {
		System.out.println(Texts.moutonIntro());
		System.out.println(Texts.getIntro());
		System.out.println("\n");
		System.out.println("1- Jeu");
		System.out.println("2- Regle");
		System.out.println("3- Quitter");

		Scanner sc = new Scanner(System.in);
		String res = "";
		while (!res.matches("[1-3]")) {
			res = sc.nextLine();
		}
		if (res.equals("1")) {
			Util.cls();
			run();
		} else if (res.equals("2")) {
			Util.cls();
			System.out.println(Texts.getRegles());
			System.out.println("\nTapper menu pour revenir");
			Scanner sc2 = new Scanner(System.in);
			String res2 = "";
			while (!res2.matches("menu")) {
				res2 = sc2.nextLine();
			}
			Util.cls();
			menu();
		} else {
			System.exit(0);
		}
	}

	public void run() {

		Partie p = new Partie(new Berger(Partie.saisieNom()), new TroupeauMouton(30));
		while (!p.isFinPartie()) {
			Util.cls();
			p.afichageDonnees();
			if (p.getTroupeau().getJaugeFaim() < 1) {
				System.out.println("Certains moutons sont mort de malnutrition");
				int nbDead = (int)(p.getTroupeau().getNbMouton()*0.2);
				p.getTroupeau().setNbMouton(p.getTroupeau().getNbMouton()-nbDead);
			}
			
			if (p.getTroupeau().isEstDansGrange()) {
				System.out.println("Voulez-vous sortir les moutons dans le pré ?\n" + "1- Oui\n" + "2- Non\n");
				Scanner sc = new Scanner(System.in);
				String res = sc.nextLine();
				while (!res.matches("[1-2]")) {
					res = sc.nextLine();
				}
				if (res.equals("1")) {
					p.getTroupeau().setEstDansGrange(false);
				}
			}
			
			if (p.getTroupeau().getNbMalade() > 0) {
				p.getTroupeau().setNbMalade(p.getTroupeau().getNbMalade()
						+ (int) (Math.random() * (p.getTroupeau().getNbMouton() - p.getTroupeau().getNbMalade()) / 3));
				System.out.println("La maladie s'est propagée ! Il y a désormais " + p.getTroupeau().getNbMalade()
						+ " moutons malades.");
				if (p.getB().getJaugeFatigue() >= 5) {
					System.out.println("Voulez-vous abattre les moutons malades ?(-2 pt)\n" + "1- Oui\n" + "2- Non\n");
					Scanner sc = new Scanner(System.in);
					String rep = "";
					while (!rep.matches("[1-2]")) {
						rep = sc.nextLine();
					}
					if (rep.equals("1")) {
						System.out
								.println("Vous avez abattu les " + p.getTroupeau().getNbMalade() + " moutons malades.");
						p.getB().setJaugeFatigue(p.getB().getJaugeFatigue() - 2);
						p.getTroupeau().setNbMouton(p.getTroupeau().getNbMouton() - p.getTroupeau().getNbMalade());
						p.getTroupeau().setNbMalade(0);
					} else {
						System.out.println(Texts.getBergerFatigue());
					}
				} else {
					System.out.println(Texts.getBergerFatigue());
				}
			}
			MonAlea alea = new MonAlea();
			alea.tirage(p.getTroupeau(), p.getB());
			p.incrementeCompteur();
			
			if (!p.getTroupeau().isEstDansGrange()) {
				p.decrementHerbe();
			}

			p.variationFaimMouton();
			if (p.getHerbe() < 1) {
				System.out.println("il n'y a plus d'herbe dans la prairie... Voulez-vous bouger vos moutons ? (-2 pt)\n"
						+ "1- Oui\n" + "2- Non\n");
				Scanner sc = new Scanner(System.in);
				String rep = sc.nextLine();
				while (!rep.matches("[1-2]")) {
					rep = sc.nextLine();
				}
				if (rep.equals("1")) {
					System.out.println("Vous avez bougé vos moutons");
					p.resetHerbe();
					p.getB().setJaugeFatigue(p.getB().getJaugeFatigue() - 2);

				} else {
					if (p.getB().getJaugeFatigue() < 2) {
						System.out.println(Texts.getBergerFatigue());
					}
					System.out.println("Vos moutons n'ont plus à manger");
				}
			}
			p.finPartie();
			Util.delay();
		}
		if (p.isGagne()) {
			System.out.println("Bravo tu as sauvé tes moutons !");
		} else {
			System.out.println("Vous avez perdu, tous tes moutons sont morts...");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Jeu().menu();
	}

}
