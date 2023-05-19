import java.util.Scanner;

public class ZufallszahlRaten {
    public static void main(String[] args) {
        // Zufallszahl generieren
        int zufallszahl = (int) (Math.random() * 10) + 1;
        
        // Benutzereingabe einlesen
        Scanner scanner = new Scanner(System.in);
        int eingabe;
        
        do {
            System.out.print("Errate die Zahl (1-10): ");
            eingabe = scanner.nextInt();
            
            if (eingabe == zufallszahl) {
                System.out.println("Richtig!");
                break;
            } else {
                System.out.println("Falsch!");
            }
        } while (true);
        
        scanner.close();
    }
}