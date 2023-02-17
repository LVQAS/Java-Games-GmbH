public class Test {
	
	//Hauptmethode: Sie ist zuständig für die Ausführbarkeit
	
	public static void main (String[] args) throws InterruptedException {
		
		Spielekonsole alpha = new Spielekonsole();
		Spieler sp1 = new Spieler();

		alpha.hello();

		sp1.setName();
		System.out.println();

		sp1.setAlter();
		System.out.println();

		sp1.setGeschlecht();
		System.out.println();

		sp1.setGroesse();
		System.out.println();
		
		System.out.println("Wilkommen " + sp1.name + "!");

		Thread.sleep(1000);
		alpha.menueAuswaehlen();

		Thread.sleep(1000);
		alpha.goodbye();
		
	}

}
