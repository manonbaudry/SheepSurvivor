package sprint2;

import java.util.Scanner;

import sprint1.Berger;
import sprint1.Texts;
import sprint1.TroupeauMouton;

public class Tombola extends ConsequenceAlea{

	
	private String mouton2() {
		return 
	"                __.'   _)\n" + 
		"                <_,)'.-\"a\\\n" + 
		"                  /' (    \\\n" + 
		"      _.-----..,-'   (`\"--^\n" + 
		"     //              |\n" + 
		"    (|   `;      ,   |\n" + 
		"      \\   ;.----/  ,/\n" + 
		"       ) // /   | |\\ \\\n" + 
		"   jgs \\ \\\\`\\   | |/ /\n" + 
		"        \\ \\\\ \\  | |\\/\n" + 
		"         `\" `\"  `\"`\n" + 
		"\n";
	}
	
	private String mouton1() {
		return"                        _.-..\n" + 
				"                      ,'9 )\\)`-.,.--.\n" + 
				"                      `-.|           `.\n" + 
				"                         \\,      ,    \\)\n" + 
				"                          `.  )._\\   (\\\n" + 
				"                            |//   `-,//\n" + 
				"                            ]||    //\"\n" + 
				"                     hjw    \"\"    \"\"\n" + 
				"\n";
				
	}
	
	private String mouton3() {
		return 
				
				"                      __\n" + 
				"            ,'```--'''  ``-''-.\n" + 
				"          ,'            ,-- ,-'.\n" + 
				"         (//            `\"'| 'a \\\n" + 
				"           |    `;         |--._/\n" + 
				"           \\    _;-._,    /\n" + 
				"            \\__/\\\\   \\__,'\n" + 
				"             ||  `'   \\|\\\\\n" + 
				"             \\\\        \\\\`'\n" + 
				"              `'        `'\n" ;
	}
	
	private String mouton4() {
		return "  ,-''''-.\n" + 
				" (.  ,.   L        ___...__\n" + 
				" /7} ,-`  `'-==''``        ''._\n" + 
				"//{                           '`.\n" + 
				"\\_,X ,                         : )\n" + 
				"    7                          ;`\n" + 
				"    :                  ,       /\n" + 
				"     \\_,                \\     ;\n" + 
				"       Y   L_    __..--':`.    L\n" + 
				"       |  /| ````       ;  y  J\n" + 
				"       [ j J            / / L ;\n" + 
				"       | |Y \\          /_J  | |\n" + 
				"       L_J/_)         /_)   L_J\n" + 
				"      /_)               sk /_)\n" + 
				"";
	}
	@Override
	public void effectuerAlea(TroupeauMouton moutons, Berger b) {
		System.out.println(Texts.getAleaTombola());
		System.out.println("Un mouton vous est présenté :");
		double r = Math.random();
		String mouton = "";
		double poids = 10;
		if (r < 0.25) {
			System.out.println(mouton1());
			mouton = mouton1();
			poids = 20*r;
		}else if (r < 0.50) {
			System.out.println(mouton2());
			poids = 30*r;
			mouton = mouton2();
		}else if (r < 0.75) {
			System.out.println(mouton3());
			poids = 25*r;
			mouton = mouton3(); 
		}else {
			System.out.println(mouton4());
			poids = 20 * r;
			mouton = mouton4();
		}
		
		System.out.println("Combien pensez-vous qu'il pèse ? (en kg)");
		Scanner sc = new Scanner(System.in);
		
		String res = "";
		while(! res.matches("[0-9]+.?[0-9]*")) {
			res = sc.nextLine();
		}
		double J1 = Math.random()*50;
		double J2 = Math.random()*40;
		double J3 = Math.random()*30;
		double liftJ1 = (poids - J1) * (poids - J1);
		double liftJ2 = (poids - J2) * (poids - J2);
		double liftJ3 = (poids - J3) * (poids - J3);
		
		double berger = Double.parseDouble(res);
		double liftBerger = (poids - berger) * (poids - berger);
		if (liftBerger < liftJ1 && liftBerger < liftJ2 && liftBerger < liftJ3) {
			System.out.println("Félicitations ! Le mouton pesait " + poids + " kg !"
					+ "Vous avez remporté le mouton, il rentrera avec vous.\n" + mouton);
			moutons.setNbMouton(moutons.getNbMouton()+1);
		}else {
			System.out.println("Dommage, un participant a visé plus juste que vous."
					+ "Le mouton pesait " + poids + " kg.");
		}
	}

}
