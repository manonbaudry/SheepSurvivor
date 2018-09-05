/**
 * Groupe 9
 * 05/09/2018
 */
package sprint1;

public class Berger {
	private String nom;
	private int jaugeFatigue;
	//jauge à ajouter 
	
	public Berger(String nom) {
		this.nom = nom;
		jaugeFatigue = 10;
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

	/**
	 * @param jaugeFatigue the jaugeFatigue to set
	 */
	public void setJaugeFatigue(int jaugeFatigue) {
		this.jaugeFatigue = jaugeFatigue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Berger" + nom  + "  jaugeFatigue  " + jaugeFatigue;
	}
	
	
}
