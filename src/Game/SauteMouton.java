package Game;

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
			
		}
		return moutons;
	}
	
	
}
