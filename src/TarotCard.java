public class TarotCard {
    private String name;
    private String uprightMeaning;
    private String reversedMeaning;

    public String getName() {
        return name;
    }
    public String getUprightMeaning() {
        return uprightMeaning;
    }
    public String getReversedMeaning() {
        return reversedMeaning;
    }

    public TarotCard(String name, String uprightMeaning, String reversedMeaning){
    this.name = name;
    this.uprightMeaning = uprightMeaning;
    this.reversedMeaning = reversedMeaning;
    }
}
