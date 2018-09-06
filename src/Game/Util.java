package Game;

public class Util {

	public static void delay() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}

	public static void cls() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	}

}
