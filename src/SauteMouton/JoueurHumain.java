package SauteMouton;

import java.util.ArrayList;
import java.util.Scanner;

public class JoueurHumain{

	public int coupAJouer(ArrayList<Integer> possibles) {
		System.out.print("Les coups possibles : ");
		for (Integer integer : possibles) {
			System.out.print(integer+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String nxt = "";
		while (!nxt.matches("[0-9][0-9]*") || !possibles.contains(Integer.parseInt(nxt))) {
			System.out.print("Choisisez un coup : ");
			nxt = sc.nextLine();
		}
		return Integer.parseInt(nxt);
	}
	
		

}
