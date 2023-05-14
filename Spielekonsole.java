import java.util.Scanner;

public class Spielekonsole {
	String spiel;

	public void hello() {
		System.out.println("Starten der JavaGames GmbH Spielekonsole erfolgreich!");
	}

	public void goodbye() {
		System.out.println("Bis Baldrian!");
	}

	public void menueAuswaehlen() {
		Scanner eingabe = new Scanner(System.in); // Der Hinweis "Eingabe is never closed" kann ignoriert werden!
		System.out.println("Wähle ein Spiel: Spiel 1, Spiel 2 oder Spiel 3");
	
		String spiel = eingabe.nextLine();
	
		switch (spiel) {
			case "1":
			case "eins":
				System.out.println("Du hast Spiel 1 gewählt!");
				break;
	
			case "2":
			case "zwei":
				System.out.println("Du hast Spiel 2 gewählt!");
				break;
	
			case "3":
			case "drei":
				System.out.println("Du hast Spiel 3 gewählt!");
				break;
	
			default:
				System.out.println("Dieses Spiel existiert nicht!");
		}
	}
}