package Game;

public class Maladie implements Alea  {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {


		if (moutons.getNbMalade() > 0) {
			int nbMoutonsMorts = (int)(moutons.getNbMalade() * (Math.random()/2));
			if (nbMoutonsMorts == 0) {
				nbMoutonsMorts ++;
			}
			System.out.println("La maladie a tué " + nbMoutonsMorts +" moutons malades !");
			moutons.setNbMalade(moutons.getNbMalade()-nbMoutonsMorts);
			moutons.setNbMouton(moutons.getNbMouton()-nbMoutonsMorts);
		}
		System.out.println(Texts.getAleaMaladie());
		moutons.setNbMalade(moutons.getNbMalade() + (int)(Math.random()*(moutons.getNbMouton()-moutons.getNbMalade()) / 3));
		
	}

}
