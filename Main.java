import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables and scanner
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";

        // Set affiliation and ask question
        System.out.print("What is your Party Affiliation (D, R, I, O): ");
        partyAffiliation = in.nextLine();

        // If structure to determine output
        if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You selected Other.");
        }
    }
}