package Game;

import java.util.Scanner;

public class Canicule implements Alea {

	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger berger) {

		System.out.println(Texts.getAleaCannicule());
		System.out.println("Voulez-vous tondre la laine des moutons ?(-4 pt)\n"
				+ "1- Oui\n"
				+ "2- Non\n");
		Scanner sc = new Scanner(System.in);
		String res2 = sc.nextLine();
		while (!res2.matches("[1-2]")) {
			res2 = sc.nextLine();
		}
		if (res2.equals("1") && berger.getJaugeFatigue() >= 4) {
			//Baisser fatigue berger
			berger.setJaugeFatigue(berger.getJaugeFatigue()- 4);
			System.out.println("Vous avez tondu les moutons");
		}else {
			
			if (moutons.getNbMalade() > 0) {
				System.out.println("La canicule a tué tous vos moutons malades !");
				moutons.setNbMouton(moutons.getNbMouton() - moutons.getNbMalade());
				moutons.setNbMalade(0);

			} else {
				int rdm = (int)(Math.random()* moutons.getNbMouton() / 4);
				if (rdm == 0) {
					rdm ++;
				}
				System.out.println("La canicule a tué " + rdm + " mouton(s) !");
				moutons.setNbMouton(moutons.getNbMouton() - rdm);
			}
		}


	}
	
	public static void main (String[] args) {
		
	}

}
