import java.util.Scanner; // Scanner importiert damit eine Zahl eingebene werden kann

public class ZufallszahlRaten { // Erstellung der Klasse "ZufallszahlRaten"
    public void LaunchZufallszahlRaten() {
        // Zufallszahl generieren
        int zufallszahl = (int) (Math.random() * 10) + 1;
        
        // Benutzereingabe einlesen
        Scanner scanner = new Scanner(System.in);
        int eingabe;
        
        do {
            System.out.print("Errate die Zahl (1-10): ");
            eingabe = scanner.nextInt();
            
            if (eingabe == zufallszahl) { // If else Verzweigung mit Textausgabe
                System.out.println("Richtig!");
                break;
            } else {
                System.out.println("Falsch!");
            }
        } while (true);
        
       // scanner.close(); // Schließung des Scanners
    }
}