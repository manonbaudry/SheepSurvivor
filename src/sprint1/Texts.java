package sprint1;

public class Texts {

	/**
	 * Affiche deux moutons pour l'intro
	 * @return
	 */
	public static String moutonIntro() {
		return "        __  _\n" + 
				"       .-.'  `; `-._  __  _\n" + 
				"      (_,         .-:'  `; `-._\n" + 
				"    ,'o\"(        (_,           )\n" + 
				"   (__,-'      ,'o\"(            )>\n" + 
				"      (       (__,-'            )\n" + 
				"       `-'._.--._(             )\n" + 
				"          |||  |||`-'._.--._.-'\n" + 
				"                     |||  |||\n";
	}
	
	public static String getIntro() {
		return "\t   Bienvenue dans l'univers d'un berger\n"
				  + "\n"
				  + "     Vous allez decouvrir que cette dure vie faite de labeur\n"
				  + "Dans votre ferme des choix cruciaux seront necessaire pour la \n"
				  + "survie de votre troupeau de mouton\n"
				  +"\n"
				  + "\tArriverez-vous à en avoir le plus possible ?";
	}
	
	public static String getRegles() {
		return 	  "1- Vous devez reussir a avoir le plus grand nombre de mouton\n"
				+ "2- Le nombre de jours est de 20\n"
				+ "3- Si vous n'avez plus de mouton c'est la fin de la partie\n"
				+ "4- Si votre jauge de fatigue est au maximum vous ne pourrez plus faire d'action\n";
	}

	
}
