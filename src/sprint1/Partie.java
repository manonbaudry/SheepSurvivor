/**
 * Groupe 9
 * 05/09/2018
 */
package sprint1;

import java.util.Scanner;

public class Partie {
	public static String saisieNom() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nom:");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	
	
	public static void main (String [] args) {
		Berger b = new Berger(saisieNom());
		TroupeauMouton troupeau = new TroupeauMouton(30);
		b.toString();
		
	}

}
