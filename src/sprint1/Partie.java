/**
 * Groupe 9
 * 05/09/2018
 */
package sprint1;

import java.util.Scanner;

public class Partie {
	
	private Berger b; 
	private TroupeauMouton troupeau;

	
	/**
	 * @param b
	 * @param troupeau
	 */
	public Partie(Berger b, TroupeauMouton troupeau) {
		this.b = b;
		this.troupeau = troupeau;
	}

	public static String saisieNom() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir votre nom:");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	
	public void afichageDonnees() {
		
		System.out.println(b.getNom()+ "T R O U P E A U :\n S A N T É :" + b.getJaugeFatigue());
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

	public static void main (String [] args) {
		Partie p = new Partie(new Berger(saisieNom()), new TroupeauMouton(30));
		System.out.println(Texts.moutonIntro());
		System.out.println(Texts.getIntro());
		System.out.println(Texts.getRegles());
		System.out.println(p.getB().getNom());
		System.out.println(p.getTroupeau().toString());
		
	}

}
