package sprint1;

public class Mouton {

	private boolean estMalade;
	
	public Mouton() {
		estMalade = false;
	}
	
	
	
	public void setMalade(boolean estMalade) {
		this.estMalade = estMalade;
	}
	
	public boolean isMalade() {
		return estMalade;
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
