public class Main {
    public static void main(String[] args) {
        TarotDeck deck = new TarotDeck();
        DrawnCard drawn = deck.drawCard();
        TarotCard card = drawn.getCard();

        System.out.print(card.getName());
        if (drawn.getIsReversed()) {
            System.out.println(" (reversed)");
            System.out.println(card.getReversedMeaning());
        } else {
            System.out.println(" (upright)");
            System.out.println(card.getUprightMeaning());
        }
    }
}