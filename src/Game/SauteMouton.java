package Game;

import java.util.ArrayList;
import java.util.Arrays;

public class SauteMouton {

	private int[] prairie;
	
	public SauteMouton() {
		prairie = new int[7];
		for (int i = 0; i < prairie.length; i++) {
			if (i == prairie.length/2) {
				prairie[i] = 0;
			}else if (i < prairie.length/2) {
				prairie[i] = 1;
			}else {
				prairie[i] = -1;
			}
		}
	}
	
	@Override
	public String toString() {
		String moutons = "";
		for (int i = 0; i < prairie.length; i++) {
			if (prairie[i] == 0) {
				moutons+= "        ";
			}else if (prairie[i] == 1) {
				moutons += "  ,---@> ";
			}else {
				moutons += " <@---.  ";
			}
		}
		moutons+="\n";
		for (int i = 0; i < prairie.length; i++) {
			if (prairie[i] == 0) {
				moutons+= " _______ ";
			}else if (prairie[i] == 1) {
				moutons += "    W-W' ";
			}else {
				moutons += " 'W-W    ";;
			}
		}
		moutons+="\n\n";
		for (int i = 0; i < prairie.length; i++) {
			moutons+= "    "+i+"    ";
		}
		return moutons+"\n";
	}
	
	public boolean isValide(int dest) {
		return dest > -1 && dest < 8 && prairie[dest] == 0;
	}
	
	public boolean deplacement(int mt) {
		if (isValide(mt)) {
			if (prairie[mt] == 1) {
				if (prairie[mt+1] == 0) {
					prairie[mt+1] = 1;
					prairie[mt] = 0;
				}else {
					prairie[mt+2] = 1;
					prairie[mt] = 0;
				}
			}else {
				if (prairie[mt-1] == 0) {
					prairie[mt-1] = -1;
					prairie[mt] = 0;
				}else {
					prairie[mt-2] = -1;
					prairie[mt] = 0;
				}
			}
			return true;
		}
		return false;
	}
	
	public ArrayList<Integer> coupsPossibles() {
		ArrayList<Integer> cpPossible = new ArrayList<Integer>();
		for (int i = 0; i < prairie.length; i++) {
			if (ok(i)) {
				cpPossible.add(i);
			}
		}
		return cpPossible;
	}
	
	private boolean ok(int coup) {
		if (prairie[coup] == 0) {
			return false;
		}else if (prairie[coup] == 1 && prairie[coup+1] != 0 && prairie[coup+2] != 0) {
			return false;
		}else if (prairie[coup] == -1 && prairie[coup-1] != 0 && prairie[coup-2] != 0) {
			return false;
		}
		return true;
	}
	
	public boolean bloque() {
		return coupsPossibles().isEmpty();
	}
	
	public boolean gagnant() {
		if (prairie[prairie.length/2] != 0) {
			return false;
		}
		for (int i = 0; i < prairie.length/2; i++) {
			if (prairie[i] != -1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		SauteMouton sm = new SauteMouton();
		System.out.println(sm);
		System.out.println("Coups possible : "+sm.coupsPossibles().toString());		
		System.out.println(sm.deplacement(2));
		System.out.println(sm);
		System.out.println("Coups possible : "+sm.coupsPossibles().toString());
	}
	
}
