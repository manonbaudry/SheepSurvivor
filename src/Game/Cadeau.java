package Game;

public class Cadeau implements Alea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {
		int nbCadeau = 1+(int)(Math.random()*9);
		
		System.out.println(Texts.getAleaCadeau(nbCadeau));
		
		moutons.setNbMouton(moutons.getNbMouton()+nbCadeau);
	}

}
