package sprint1;

public enum Alea {
	LOUPS, TEMPETE, NAISSANCE, TOMBOLA, RIEN, MALADIE;//, FAMINE(0)

	
	public Alea tirage() {
		double tirage = Math.random();
		if (tirage < 0.2) {
			return LOUPS;
		}else if (tirage < 0.5) {
			return TEMPETE;
		}else if (tirage < 0.6) {
			return NAISSANCE;
		} else if (tirage < 0.7) {
			return TOMBOLA;
		}else if (tirage < 0.8) {
			return MALADIE;
		}
		return RIEN;
	}
}
