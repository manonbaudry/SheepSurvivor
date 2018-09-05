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
				+ "4- Si votre jauge de santé est au minimum, vous ne pourrez plus faire d'action\n";
	}
	
	public static String getAleaLoups() {
		return	"Vous êtes attaqué par les loups ! Vite, protégez vos moutons !\n"
				+ "";
	}
	public static String getAleaMaladie() {
		return	"Un ou plusieurs moutons semblent malades, ils pourraient contaminer\n"
				+ "le reste du troupeau !\n";
	}

	public static String getAleaTempete() {
		return	"Un orage se profile. Rentrez votre troupeau à la bergerie, mais prudence :\n"
				+ "ils n'y trouveront pas d'herbe à brouter !\n";
	}
	
	public static String getAleaNaissance(int nombrePetits) {
		return "Bonne nouvelle à la ferme : votre troupeau compte " + nombrePetits + "nouveaux nés !\n";
	}

	public static String getAleaTombola() {
		return "Tombola au village : tentez de gagner un mouton !\n";
	}
}
