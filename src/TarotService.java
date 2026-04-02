public class TarotService {

    private TarotDeck deck;

    public TarotService(){
        this.deck = new TarotDeck();
    }

    // creates a new deck

    public DrawnCard drawSingleCard(){
        return deck.drawCard();
    } // method that returns a drawn card from the deck
}
