package Game;

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
				+ "4- Si votre jauge de santé est au minimum, vous ne pourrez plus faire d'action\n";
	}
	
	public static String getAleaLoups() {
		return	"Vous êtes attaqué par les loups ! Vite, protégez vos moutons !\n"; 
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
		return "Bonne nouvelle à la ferme : votre troupeau compte " + nombrePetits + " nouveaux nés !\n";
	}

	public static String getAleaTombola() {
		return "Tombola au village : tentez de gagner un mouton !\n";
	}
	
	public static String getAleaSauteMouton(){
		return "Des moutons veulent s'echapper arriverai vous à les echanger de cotes";
	}
	
	public static String getAleaCadeau(int nbCadeau){
		return "Un de vos voisin vous donne gracieusement "+nbCadeau+"mouton(s)";
	}
	
	public static String getBergerFatigue() {
		return ("Le berger est trop fatigué pour effectuer cette tâche. Vous devriez prendre un jour de congé !");
	}
	
	public static String getAleaCannicule() {
		return ("Canicule en approche. Vos moutons vont mourir de chaud si vous ne les tondez pas !");
	}
}
