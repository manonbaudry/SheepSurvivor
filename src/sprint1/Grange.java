package sprint1;

public class Grange {
	
	TroupeauMouton troupeau;
	int nbMoutonsGrange;
	
	public Grange() {
		this.nbMoutonsGrange = troupeau.getNbMouton();
	}
	
	public boolean estVide() {
		return nbMoutonsGrange == 0;
	}

	public int getNbMoutons() {
		return nbMoutonsGrange;
	}
	
	public String toString() {
		return ("Il y a actuellement "+ nbMoutonsGrange + " dans la grange !");
	}
	
	
	

}
