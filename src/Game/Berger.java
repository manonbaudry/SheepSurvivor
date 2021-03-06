/**
 * Groupe 9
 * 05/09/2018
 */
package Game;

public class Berger {
	private String nom;
	private int jaugeFatigue;
	private final int MAXFATIGUE;
	
	public Berger(String nom) {
		this.nom = nom;
		MAXFATIGUE = 10;
		jaugeFatigue = MAXFATIGUE;
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the jaugeFatigue
	 */
	public int getJaugeFatigue() {
		return jaugeFatigue;
	}
	
	public int getMAXFATIGUE() {
		return MAXFATIGUE;
	}

	/**
	 * @param jaugeFatigue the jaugeFatigue to set
	 */
	public void setJaugeFatigue(int jaugeFatigue) {
		this.jaugeFatigue = jaugeFatigue;
	}
	
	public void resetJaugeFatigue() {
		setJaugeFatigue(MAXFATIGUE);
	}
	
	public String showJaugeFatigue() {
		String res = "";
		for (int i = 0; i < 10; i++) {
			if (jaugeFatigue>i) {
				res+="#";
			}else {
				res+=".";
			}
		}
		return res;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Berger" + nom  + "  jaugeFatigue  " + jaugeFatigue;
	}
	
	
}
