import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Lovetester.java
 * 
 * @author  Jury, Fred-Oliver
 * @version 0.1
 * Date     25.11.2014
 */
public class Lovetester{

    /**
     * Method to count chars.
     *
     * @param str the string
     * @return the int
     */
    private static int stringCalculator(String str) {
        // Count character at string
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            // we count only characters 
            if (Character.isLetter(str.charAt(j))) {
                i++;
            }
        }
        // return number of chars
        return i;
    }

    /**
     * The main method.
     * Start inputmethod, count with stringCalculator and calculate something stupid
     * to cancel loves, have some fun or something else dumb
     *
     * @param args the arguments
     */
     public static void main(String[] args) {
        // try getting input and calculate lovevibes
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ob Ihr als Paar gluecklich werdet, koennt Ihr hier herausfinden.");
            System.out.print("Bitte gebe nun deinen Namen ein: ");
            // get names from input and count characters by stringCalculator
            int a = stringCalculator(reader.readLine());
            System.out.print("Bitte gebe nun den Namen deines Wunschpartners ein: ");
            int b = stringCalculator(reader.readLine());
            // only if both names having more than two characters make a decision
            // don't ask why the hell they have to be at last two characters, I fell better with it
            // if that Names are R2D2 or C3PO - who cares...
            if (a > 2 && b > 2) {
                // very complicated calculations
                int x = a + b;
                // modulo helps to make a boolean decision
                if (x % 2 != 0) {
                    System.out.println("Keine Chance, Ihr seid zu unterschiedlich.");
                    System.out.println("Sucht euch einen anderen Partner!");
                }
                else
                {
                    System.out.println("Hier hat Schweinchen Babe seine Prinzessin gefunden.");
                    System.out.println("Ihr werdet gluecklich und bekommt viele Froschkoenige!");
                }
            }
            else
            {
                // oh damned I need 2 real characters to feel me good
                System.out.println("Bitte geben Sie Namen mit wenigstens je zwei Buchstaben ein");
            }
        }
        // catch any Exception (instead of only IOException)
        catch (Exception e) {
            System.out.println("Ein Fehler trat auf -");
            System.out.println("Bitte geben Sie zwei Namen mit wenigstens je zwei Buchstaben ein");
        }
    }
}