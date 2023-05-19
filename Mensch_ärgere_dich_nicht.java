import java.util.Scanner;

public class Mensch_ärgere_dich_nicht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            int wurf = werfeWuerfel();
            System.out.println("Du hast eine " + wurf + " gewürfelt.");
            
            if (wurf == 6) {
                System.out.println("Glückwunsch! Du darfst nochmal würfeln.");
            } else {
                System.out.println("Das Spiel ist vorbei.");
                break;
            }
            
            System.out.print("Möchtest du nochmal würfeln? (ja/nein): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("ja"));
        
        scanner.close();
    }
    
    public static int werfeWuerfel() {
        return (int) (Math.random() * 6) + 1;
    }
}