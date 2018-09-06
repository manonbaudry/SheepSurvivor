/**
 * 
 */
package Game;

/**
 * @author baudrym
 *
 */
public class MonAlea {
	
	public void tirage(TroupeauMouton t, Berger b) {
		double tirage = Math.random();
		if (tirage < 0.1) {
			new Naissance().effectuerAlea(t, b);
		}else if (tirage < 0.3) {
			new Tempete().effectuerAlea(t, b);
		}else if (tirage < 0.5) {
			new Loups().effectuerAlea(t, b);
		} else if (tirage < 0.6) { 
			new Tombola().effectuerAlea(t, b);
		}else if (tirage < 0.7) {
			new Maladie().effectuerAlea(t, b); 
		}else if (tirage < 0.9) {
			new Canicule().effectuerAlea(t, b);
		}else {
			System.out.println("Il ne s'est rien passé aujourd'hui");
			b.resetJaugeFatigue();
		}
		
	}
}
