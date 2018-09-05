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
		String res = "";
		int nbm = this.nbMouton;
		while (nbm > 0) {
			for (int i = 0; i < 10 && nbm > 0; i++) {
				res += "  ,---@> ";
			}
			res += "\n";
			nbm = this.nbMouton;
			for (int i = 0; i < 10  && nbm > 0; i++) {
				res += "   W-W'  ";
			}
		}
		return res;

	}

	public static void main(String[] args) {
		TroupeauMouton tm = new TroupeauMouton(11);
		System.out.println(tm.toString());
	}

}
