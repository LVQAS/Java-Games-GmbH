import java.util.Scanner; // Scanner importiert damit eine Zahl eingebene werden kann

public class Mensch_ärgere_dich_nicht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            int wurf = werfeWuerfel(); // Deklaration der Variable "wurf"
            System.out.println("Du hast eine " + wurf + " gewürfelt.");
            
            if (wurf == 6) { // If else Verzweigung mit Textausgabe
                System.out.println("Glückwunsch! Du darfst nochmal würfeln.");
            } else {
                System.out.println("Das Spiel ist vorbei.");
                break;
            }
            
            System.out.print("Möchtest du nochmal würfeln? (ja/nein): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("ja")); // Schleife, ie solange läuft, wie der Benutzer "ja" eingibt
        
        scanner.close(); // Schließung des Scanners
    }
    
    public static int werfeWuerfel() { // Simulation des Würfel wurfes
        return (int) (Math.random() * 6) + 1; // generiert eine zufällige Zahl
    }
}