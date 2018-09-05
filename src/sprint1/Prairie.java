package sprint1;

public class Prairie {
	int qteherbeactuelle;
	TroupeauMouton troupeau;
	int nbMoutonsPrairie;
	
	public Prairie(int qteherbeactuelle) {
		this.qteherbeactuelle = qteherbeactuelle;
		this.nbMoutonsPrairie = troupeau.getNbMouton();
	}
	
	public boolean estVide() {
		return nbMoutonsPrairie==0;
	}
	
	public boolean estDefraichi() {
		return qteherbeactuelle==0;
	}

	public int getQteherbeactuelle() {
		return qteherbeactuelle;
	}

	public int getQteMouton() {
		return nbMoutonsPrairie;
	}

	public String toString() {
		return ("Il y a actuellement "+nbMoutonsPrairie+" dans la prairie !");
	}
	
}
