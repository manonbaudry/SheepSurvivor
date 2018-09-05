package sprint1;

public class TroupeauMouton {

	private int nbMalade;
	private int nbMouton;
	
	public TroupeauMouton(int nbMouton) {
		nbMalade = 0;
		this.nbMouton = nbMouton;
	}
	
	public int getNbMalade() {
		return nbMalade;
	}
	
	public int getNbMouton() {
		return nbMouton;
	}
	
	public void setNbMalade(int nbMalade) {
		this.nbMalade = nbMalade;
	}
	
	public void setNbMouton(int nbMouton) {
		this.nbMouton = nbMouton;
	}
	
	@Override
	public String toString() {
		String res =
				"        __  _\n" + 
				"       .-.'  `; `-._  __  _\n" + 
				"      (_,         .-:'  `; `-._\n" + 
				"    ,'o\"(        (_,           )\n" + 
				"   (__,-'      ,'o\"(            )>\n" + 
				"      (       (__,-'            )\n" + 
				"       `-'._.--._(             )\n" + 
				"          |||  |||`-'._.--._.-'\n" + 
				"                     |||  |||\n";
		return res;
	}

}
