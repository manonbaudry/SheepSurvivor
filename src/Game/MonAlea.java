/**
 * 
 */
package Game;

import SauteMouton.SauteMouton;

/**
 * @author baudrym
 *
 */
public class MonAlea {
	
	public void tirage(TroupeauMouton t, Berger b) {
		double tirage = Math.random();
		if (tirage < 0.2) {
			new Naissance().effectuerAlea(t, b);
		}else if (tirage < 0.5) {
			new Tempete().effectuerAlea(t, b);
		}else if (tirage < 0.55) {
			new Loups().effectuerAlea(t, b);
		}else if (tirage < 0.6) {
			new SauteMouton().effectuerAlea(t, b);
		} else if (tirage < 0.65) { 
			new Tombola().effectuerAlea(t, b);
		}else if (tirage < 0.8) {
			new Maladie().effectuerAlea(t, b); 
		}else {
			System.out.println("Il ne s'est rien passé aujourd'hui");
			b.resetJaugeFatigue();
		}
		
	}
}
