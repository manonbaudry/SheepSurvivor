package Game;

public class Naissance implements Alea  {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {
		int naissance = (int)(((moutons.getNbMouton()-moutons.getNbMalade()) )* Math.random() / 5);
		if (naissance == 0) {
			naissance ++;
		}
		moutons.setNbMouton(moutons.getNbMouton()+naissance);
		System.out.println(Texts.getAleaNaissance(naissance));
	}

}
