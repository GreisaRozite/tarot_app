public class DrawnCard {
    private TarotCard card;
    private boolean isReversed;

    public TarotCard getCard(){
        return card;
    }

    public boolean getIsReversed(){
        return isReversed;
    }

    public DrawnCard(TarotCard card, boolean isReversed){
        this.card = card;
        this.isReversed = isReversed;
    }
}
