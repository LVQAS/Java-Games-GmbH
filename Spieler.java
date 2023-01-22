import java.util.Scanner;
public class Spieler{

    String name;
    int alter; //Deklariert
    String geschlecht;
    double groesse;

    void setName()
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wie heißt du?");
		name = eingabe.next();
		System.out.println("Dein Name ist nun als " + name + " gespeichert.");
        //eingabe.close();
    }

    void setAlter()
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wie alt ist bist du, " + name + "?");
		alter = eingabe.nextByte();
		System.out.println(name+ " ist " + alter + " Jahre alt.");
        //eingabe.close();
    }

    void setGeschlecht()
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Was ist dein Geschlecht, " + name + "?");
		geschlecht = eingabe.next();
        
        if (geschlecht.equals("m")) {
            System.out.println("Dein Geschlecht ist: männlich.");
        }
        else if (geschlecht.equals("w")) {
            System.out.println("Dein Geschlecht ist: weiblich.");
        }
        else {
            System.out.println("Der Buchstabe konnte keinem Geschlecht zugeordnet werden...");
        }
        //eingabe.close();
    }

    void setGroesse()
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wie groß bist du, " + name + "?");
		groesse = eingabe.nextDouble();
		System.out.println(name+ " ist " + groesse + " meter groß.");
        //eingabe.close();
    }

}
