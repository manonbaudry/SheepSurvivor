/**
 * Groupe 9
 * 05/09/2018
 */
package Game;

import java.util.Scanner;

public class Partie {
	private Berger b; 
	private TroupeauMouton troupeau;
	private int compteur;
	private boolean finPartie;
	private int herbe;
	/**
	 * @param b
	 * @param troupeau
	 */
	public Partie(Berger b, TroupeauMouton troupeau) {
		this.b = b;
		this.troupeau = troupeau;
		this.compteur = 0;
		this.finPartie = false;
		this.herbe = 10;
	}
	/**
	 * @return the compteur
	 */
	public int getCompteur() {
		return compteur;
	}

	/**
	 * @param compteur the compteur to set
	 */
	public void incrementeCompteur() {
		compteur++;
	}

	/**
	 * @return the finPartie
	 */
	public boolean isFinPartie() {
		return finPartie;
	}



	public static String saisieNom() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Saisir votre nom:");
		String str = sc.nextLine();
//		sc.close();
		return str;
	}
	
	public void afichageDonnees() {
		System.out.println(b.getNom() + 
				"\nEnergie du berger :" + b.showJaugeFatigue()+
				"\nTour n°" + compteur + 
				"\nSatiété des moutons :" + troupeau.showJaugeFaim() +
				"\n" +troupeau.toString());
		if(troupeau.isEstDansGrange()) {
			System.out.println("Le troupeau est dans la grange");
		}else {
			System.out.println("Le troupeau est dans la prairie");
		}
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
	
	public void finPartie() {
		if(compteur > 20) {
			finPartie = true;
		}
	}
	public void variationFaimMouton() {
		if(troupeau.isEstDansGrange() || herbe < 1) {
			troupeau.setJaugeFaim(troupeau.getJaugeFaim()-2);
		}else if (troupeau.getJaugeFaim()<10) {
			 
			troupeau.setJaugeFaim(troupeau.getJaugeFaim()+1);
			decrementHerbe();
		}
	}
	
	public void decrementHerbe() {
		this.herbe --;
	}
	
	public void resetHerbe() {
		this.herbe = 10;
	}
	/**
	 * @return the herbe
	 */
	public int getHerbe() {
		return herbe;
	}
	/**
	 * @param herbe the herbe to set
	 */
	public void setHerbe(int herbe) {
		this.herbe = herbe;
	}
}
