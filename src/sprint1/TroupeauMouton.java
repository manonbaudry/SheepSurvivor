package sprint1;

public class TroupeauMouton {

	private int nbMalade;
	private int nbMouton;
	private int jaugeFaim;

	public TroupeauMouton(int nbMouton) {
		nbMalade = 0;
		jaugeFaim = nbMouton;
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
	
	public int getJaugeFaim() {
		return jaugeFaim;
	}
	
	public void setJaugeFaim(int jaugeFaim) {
		this.jaugeFaim = jaugeFaim;
	}

	@Override
	public String toString() {
		String res = "";
		int nbm1 = this.nbMouton;
		int nbm2 = this.nbMouton;
		while (nbm1 > 0) {
			for (int i = 0; i < 15 && nbm1>0 ; i++) {
				res += "  ,---@>";
				nbm1--;
			}
			res += "\n";
			for (int i = 0; i < 15  && nbm2 > 0; i++) {
				res += "   W-W' ";
				nbm2--;
			}
			res += "\n\n";
		}
		return res;

	}

}
