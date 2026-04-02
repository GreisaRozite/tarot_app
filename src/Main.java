import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // show menu, read input, run action

        System.out.println("Welcome to Tarot!");
        System.out.println("1 — Draw a card");
        System.out.println("2 — Quit");

        Scanner choice = new Scanner(System.in);
        int choiceMade = choice.nextInt();

        while (choiceMade == 1) {
             // draws a new card
            DrawnCard card;
            TarotService reader = new TarotService(); // create a reader object

            card = reader.drawSingleCard();
            // there exists a drawn card now

            String name;
            name = card.getCard().getName();

            boolean reversed;
            reversed = card.getIsReversed();

            if (reversed) {
                System.out.println("\nYour card: " + name + " (reversed)\n");
                System.out.println("Themes: " + card.getCard().getUprightMeaning() + "\n");
            } else {
                System.out.println("\nYour card: " + name + " (upright)\n");
                System.out.println("Themes: " + card.getCard().getUprightMeaning() + "\n");
            }

            System.out.println("Press 1 for another card \n(anything else to quit)");
            choiceMade = choice.nextInt();

        }

    }
}