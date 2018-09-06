/**
 * Groupe 9
 * 05/09/2018
 */
package sprint2;
import sprint3.Util;
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
			MonAlea alea = new MonAlea();
			alea.tirage(p.getTroupeau(), p.getB());
			p.incrementeCompteur();
			p.finPartie();
			Util.delay();
		}

		
		

	}

}
