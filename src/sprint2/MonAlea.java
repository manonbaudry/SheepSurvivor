/**
 * 
 */
package sprint2;

import sprint1.Alea;
import sprint1.Berger;
import sprint1.TroupeauMouton;

/**
 * @author baudrym
 *
 */
public class MonAlea {
	
	public void tirage(TroupeauMouton t, Berger b) {
		double tirage = Math.random();
		if (tirage < 0.2) {
			new Loups().effectuerAlea(t, b);
		}else if (tirage < 0.5) {
			new Tempete().effectuerAlea(t, b);
		}else if (tirage < 0.6) {
			new Naissance().effectuerAlea(t, b);
		} else if (tirage < 0.7) { 
			new Tombola().effectuerAlea(t, b);
		}else if (tirage < 0.8) {
			//new Maladie().effectuerAlea(t, b); 
		}else {
			System.out.println("Il ne s'est rien passé aujourd'hui");
			b.resetJaugeFatigue();
		}
		
	}
}
