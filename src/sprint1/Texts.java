package sprint1;

public class Texts {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
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
		return "\t   Bienvenue dans la peau d'un berger\n"
				  + "\n"
				  + "Dans votre ferme des choix cruciaux seront necessaire pour la \n"
				  + "survie de votre troupeau de moutons\n"
				  +"\n"
				  + "\tArriverez-vous à en garder le plus possible avant la vente\n"
				  + "aux enchères ?";
	}
	
	public static String getRegles() {
		return 	  "1- Vous devez reussir a avoir le plus grand nombre de mouton\n"
				+ "2- Le nombre de jours est de 20\n"
				+ "3- Si vous n'avez plus de mouton c'est la fin de la partie\n"
				+ "4- Si votre jauge de fatigue est au maximum vous ne pourrez plus faire d'action\n";
	}

	
}
