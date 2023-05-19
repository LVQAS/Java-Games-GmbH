import java.util.Scanner;

public class Spielekonsole {
    String spiel;

    GuN gun = new GuN();
    ZufallszahlRaten ZFZR = new ZufallszahlRaten();
    Mensch_ärgere_dich_nicht MÄDN = new Mensch_ärgere_dich_nicht();

    public void hello() {
        System.out.println("Starten der JavaGames GmbH Spielekonsole erfolgreich!");
    }

    public void goodbye() {
        System.out.println("Bis Baldrian!");
    }

    public void menueAuswaehlen() throws InterruptedException {
        Scanner eingabe = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Wähle ein Spiel: 1-GuN, 2-Zufallszahlraten oder 3-Mensch ärgere dich nicht");
            String spiel = eingabe.nextLine();

            switch (spiel) {
                case "1":
                case "GuN":
                    System.out.println("GuN wird gestartet...");
                    Thread.sleep(1000);
                    GuN.LaunchGuN();
                    break;

                case "2":
                case "Zufallszahlraten":
                    System.out.println("Zufallszahlraten wird gestartet...");
                    Thread.sleep(1000);
                    ZFZR.LaunchZufallszahlRaten();
                    break;

                case "3":
                case "Mensch ärgere dich nicht":
                    System.out.println("Mensch ärgere dich nicht wird gestartet...");
                    Thread.sleep(1000);
                    MÄDN.LaunchMensch_ärgere_dich_nicht();
                    break;

                case "exit":
                    exit = true;
                    break;

                default:
                    System.out.println("Dieses Spiel existiert nicht!");
            }

            if (!exit) {
                System.out.println("Spiel beendet. Zurück zum Menü...");
                Thread.sleep(1000);
            }
        }

        System.out.println("Spielekonsole wird beendet...");
    }
}