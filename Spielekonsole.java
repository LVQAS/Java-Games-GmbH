import java.util.Scanner;

public class Spielekonsole
{
	int spiel;

	public void hello() {
		System.out.println("Starten der JavaGames GmbH Spielekonsole erfolgreich!");
	}
		
	public void goodbye() {
		System.out.println("Bis Baldrian!");
	}

	public void menueAuswaehlen() {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Wähle ein Spiel: Spiel 1, Spiel 2, Spiel 3");
	
		String spiel = eingabe.nextLine();
	
		try {
			int spielNummer = Integer.parseInt(spiel);
			System.out.println("Du hast Spiel " + spielNummer + " gewählt!");
		} catch (NumberFormatException e) {
			System.out.println("Du hast " + spiel + " gewählt!");
		}
	}

}
