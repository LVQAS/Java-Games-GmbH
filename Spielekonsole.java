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

	if (spiel.equals("1")) {
		System.out.println("Du hast Spiel 1 gewählt!");

	} else if (spiel.equals("2")) {
		System.out.println("Du hast Spiel 2 gewählt!");

	} else if (spiel.equals("3")) {
		System.out.println("Du hast Spiel 3 gewählt!");

	} else {
		System.out.println("Bitte gebe eine Nummer ein!");
	}
	eingabe.close();
}

}
