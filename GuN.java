import java.util.Random;

public class GuN { // Erstellung der Klasse "GuN"
    public static void LaunchGuN() {
        Random random = new Random();
        int Zufallszahl = random.nextInt(6) + 1; // generiere eine Zufallszahl zwischen 1 und 6
        System.out.println("Die Zahl ist: " + Zufallszahl);
        if (Zufallszahl == 6) {
            System.out.println("Gewinn :)");
        } else {
            System.out.println("Niete :(");
        }
    }
}