/**
 * Groupe 9
 * 05/09/2018
 */
package sprint1;

import java.util.Scanner;

public class Partie {
	private Berger b; 
	private TroupeauMouton troupeau;
	private int compteur;
	/**
	 * @return the compteur
	 */
	public int getCompteur() {
		return compteur;
	}

	/**
	 * @param compteur the compteur to set
	 */
	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	/**
	 * @return the finPartie
	 */
	public boolean isFinPartie() {
		return finPartie;
	}

	/**
	 * @param finPartie the finPartie to set
	 */
	public void setFinPartie(boolean finPartie) {
		this.finPartie = finPartie;
	}


	private boolean finPartie;
	
	/**
	 * @param b
	 * @param troupeau
	 */
	public Partie(Berger b, TroupeauMouton troupeau) {
		this.b = b;
		this.troupeau = troupeau;
		this.compteur = 0;
		this.finPartie = false;
	}

	public static String saisieNom() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir votre nom:");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	
	public void afichageDonnees() {
		System.out.println(b.getNom());
		System.out.println("Energie:" + b.showJaugeFatigue());
		System.out.println("T R O U P E A U :\n S A N T É :" + b.getJaugeFatigue());
		System.out.println(troupeau.toString());
	}
	
	/**
	 * @return the b
	 */
	public Berger getB() {
		return b;
	}

	/**
	 * @return the troupeau
	 */
	public TroupeauMouton getTroupeau() {
		return troupeau;
	}

	/**
	 * @param troupeau the troupeau to set
	 */
	public void setTroupeau(TroupeauMouton troupeau) {
		this.troupeau = troupeau;
	}

	

}
