package SauteMouton;

public enum Case {

	DROIT(1), GAUCHE(-1), VIDE(0);

	private int num;
	
	private Case(int num) {
		this.num = num;
	}
	
}
