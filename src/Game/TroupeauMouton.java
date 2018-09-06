package Game;


public class TroupeauMouton {

	private int nbMalade;
	private int nbMouton;
	private int jaugeFaim;
	private boolean estDansGrange;

	/**
	 * @return the estDansGrange
	 */
	public boolean isEstDansGrange() {
		return estDansGrange;
	}

	/**
	 * @param estDansGrange the estDansGrange to set
	 */
	public void setEstDansGrange(boolean estDansGrange) {
		this.estDansGrange = estDansGrange;
	}

	public TroupeauMouton(int nbMouton) {
		nbMalade = 0;
		jaugeFaim = 10;
		this.nbMouton = nbMouton;
		estDansGrange = false;
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

	public String showJaugeFaim() {
		String res = "";
		for (int i = 0; i < 10; i++) {
			if (jaugeFaim > i) {
				res += "#";
			} else {
				res += ".";
			}
		}
		return res;
	}

	@Override
	public String toString() {
		String res = "";
		int nbm1 = this.nbMouton;
		int nbm2 = this.nbMouton;
		int nbMlde = this.nbMalade;
		int n = 0;
		while (nbm1 > 0) {
			for (int i = 0; i < 15 && nbm1 > 0; i++) {
				if (nbMlde > i && n < nbMlde) {
					res += Texts.ANSI_RED + "  ,---@>" + Texts.ANSI_RESET;
					n++;
				} else {
					res += "  ,---@>";
				}
				nbm1--;
			}
			n=0;
			res += "\n";
			for (int i = 0; i < 15 && nbm2 > 0; i++) {
				if (nbMlde > i && n < nbMlde ) {
					res += Texts.ANSI_RED + "   W-W' " + Texts.ANSI_RESET;
					n++;
				} else {
					res += "   W-W' ";
				}
				nbm2--;
			}
			res += "\n\n";
			
		}
		return res;
	}

	public static void main(String[] args) {
		TroupeauMouton tm = new TroupeauMouton(50);
		System.out.println(tm);
		tm.setNbMalade(20);
		System.out.println(tm);
	}
	
}
