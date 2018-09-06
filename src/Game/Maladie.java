package Game;

import java.util.Random;
import java.util.Scanner;

public class Maladie extends ConsequenceAlea {

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

	public static void main(String[] args) {
		TroupeauMouton moutons = new TroupeauMouton(100);
		Berger b =new Berger("");
		ConsequenceAlea ca = new Maladie();
		ca.effectuerAlea(moutons, b);

		moutons.setNbMalade(1);
		while (moutons.getNbMalade() > 0) {
			ca.effectuerAlea(moutons, b);
			System.out.println("malades : " +moutons.getNbMalade());
			System.out.println("moutons vivants : " +moutons.getNbMouton());
		}
	}

}
