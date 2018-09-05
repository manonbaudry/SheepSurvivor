package sprint1;

public class ConsequenceAlea {
	
	public Alea tirage() {
		double tirage = Math.random();
		if (tirage < 0.2) {
			return Alea.LOUPS;  
		}else if (tirage < 0.5) {
			return Alea.TEMPETE;
		}else if (tirage < 0.6) {
			return Alea.NAISSANCE;
		} else if (tirage < 0.7) {
			return Alea.TOMBOLA;
		}else if (tirage < 0.8) {
			return Alea.MALADIE;
		}
		return Alea.RIEN;
	}
}