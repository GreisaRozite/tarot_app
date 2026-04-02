import java.util.ArrayList;
import java.util.Random;

public class TarotDeck {
    ArrayList<TarotCard> cards = new ArrayList<>();

    public TarotDeck(){
        cards.add(new TarotCard("The Fool", "innocence, new beginnings, free spirit", "recklessness, taken advantage of, inconsideration"));
        cards.add(new TarotCard("The Magician", "willpower, desire, creation, manifestation", "trickery, illusions, out of touch"));
        cards.add(new TarotCard("The High Priestess", "intuitive, unconscious, inner voice", "lack of center, lost inner voice, repressed feelings"));
        cards.add(new TarotCard("The Empress", "motherhood, fertility, nature", "dependence, smothering, emptiness, nosiness"));
        cards.add(new TarotCard("The Emperor", "authority, structure, control, fatherhood", "tyranny, rigidity, coldness"));
        cards.add(new TarotCard("The Hierophant", "tradition, conformity, morality, ethics", "rebellion, subversiveness, new approaches"));
        cards.add(new TarotCard("The Lovers", "partnerships, duality, union", "loss of balance, one-sidedness, disharmony"));
        cards.add(new TarotCard("The Chariot", "direction, control, willpower", "lack of control, lack of direction, aggression"));
        cards.add(new TarotCard("Strength", "inner strength, bravery, compassion, focus", "self doubt, weakness, insecurity"));
        cards.add(new TarotCard("The Hermit", "contemplation, search for truth, inner guidance", "loneliness, isolation, lost your way"));
        cards.add(new TarotCard("The Wheel of Fortune", "change, cycles, inevitable fate", "no control, clinging to control, bad luck"));
        cards.add(new TarotCard("Justice", "cause and effect, clarity, truth", "dishonesty, unaccountability, unfairness"));
        cards.add(new TarotCard("The Hanged Man", "sacrifice, release, martyrdom", "stalling, needless sacrifice, fear of sacrifice"));
        cards.add(new TarotCard("Death", "end of cycle, beginnings, change, metamorphosis", "fear of change, holding on, stagnation, decay"));
        cards.add(new TarotCard("Temperance", "middle path, patience, finding meaning", "extremes, excess, lack of balance"));
        cards.add(new TarotCard("The Devil", "addiction, materialism, playfulness", "freedom, release, restoring control"));
        cards.add(new TarotCard("The Tower", "sudden upheaval, broken pride, disaster", "disaster avoided, delayed disaster, fear of suffering"));
        cards.add(new TarotCard("The Star", "hope, faith, rejuvenation", "faithlessness, discouragement, insecurity"));
        cards.add(new TarotCard("The Moon", "unconscious, illusions, intuition", "confusion, fear, misinterpretation"));
        cards.add(new TarotCard("The Sun", "joy, success, celebration, positivity", "negativity, depression, sadness"));
        cards.add(new TarotCard("Judgement", "reflection, reckoning, awakening", "lack of self awareness, doubt, self loathing"));
        cards.add(new TarotCard("The World", "fulfillment, harmony, completion", "incompletion, no closure"));
        cards.add(new TarotCard("Ace of Cups", "new feelings, spirituality, intuition", "emotional loss, blocked creativity, emptiness"));
        cards.add(new TarotCard("Two of Cups", "unity, partnership, connection", "imbalance, broken communication, tension"));
        cards.add(new TarotCard("Three of Cups", "friendship, community, happiness", "overindulgence, gossip, isolation"));
        cards.add(new TarotCard("Four of Cups", "apathy, contemplation, disconnectedness", "sudden awareness, choosing happiness, acceptance"));
        cards.add(new TarotCard("Five of Cups", "loss, grief, self-pity", "acceptance, moving on, finding peace"));
        cards.add(new TarotCard("Six of Cups", "familiarity, happy memories, healing", "moving forward, leaving home, independence"));
        cards.add(new TarotCard("Seven of Cups", "searching for purpose, choices, daydreaming", "lack of purpose, diversion, confusion"));
        cards.add(new TarotCard("Eight of Cups", "walking away, disillusionment, leaving behind", "avoidance, fear of change, fear of loss"));
        cards.add(new TarotCard("Nine of Cups", "satisfaction, emotional stability, luxury", "lack of inner joy, smugness, dissatisfaction"));
        cards.add(new TarotCard("Ten of Cups", "inner happiness, fulfillment, dreams coming true", "shattered dreams, broken family, domestic disharmony"));
        cards.add(new TarotCard("Page of Cups", "happy surprise, dreamer, sensitivity", "emotional immaturity, insecurity, disappointment"));
        cards.add(new TarotCard("Knight of Cups", "following the heart, idealist, romantic", "moodiness, disappointment"));
        cards.add(new TarotCard("Queen of Cups", "compassion, calm, comfort", "martyrdom, insecurity, dependence"));
        cards.add(new TarotCard("King of Cups", "compassion, control, balance", "coldness, moodiness, bad advice"));
        cards.add(new TarotCard("Ace of Pentacles", "opportunity, prosperity, new venture", "lost opportunity, missed chance, bad investment"));
        cards.add(new TarotCard("Two of Pentacles", "balancing decisions, priorities, adapting to change", "loss of balance, disorganized, overwhelmed"));
        cards.add(new TarotCard("Three of Pentacles", "teamwork, collaboration, building", "lack of teamwork, disorganized, group conflict"));
        cards.add(new TarotCard("Four of Pentacles", "conservation, frugality, security", "greediness, stinginess, possessiveness"));
        cards.add(new TarotCard("Five of Pentacles", "need, poverty, insecurity", "recovery, charity, improvement"));
        cards.add(new TarotCard("Six of Pentacles", "charity, generosity, sharing", "strings attached, stinginess, power and domination"));
        cards.add(new TarotCard("Seven of Pentacles", "hard work, perseverance, diligence", "work without results, distractions, lack of rewards"));
        cards.add(new TarotCard("Eight of Pentacles", "apprenticeship, passion, high standards", "lack of passion, uninspired, no motivation"));
        cards.add(new TarotCard("Nine of Pentacles", "fruits of labor, rewards, luxury", "reckless spending, living beyond means, false success"));
        cards.add(new TarotCard("Ten of Pentacles", "legacy, culmination, inheritance", "fleeting success, lack of stability, lack of resources"));
        cards.add(new TarotCard("Page of Pentacles", "ambition, desire, diligence", "lack of commitment, greediness, laziness"));
        cards.add(new TarotCard("Knight of Pentacles", "efficiency, hard work, responsibility", "laziness, obsessiveness, work without reward"));
        cards.add(new TarotCard("Queen of Pentacles", "practicality, creature comforts, financial security", "self-centeredness, jealousy, smothering"));
        cards.add(new TarotCard("King of Pentacles", "abundance, prosperity, security", "greed, indulgence, sensuality"));
        cards.add(new TarotCard("Ace of Swords", "breakthrough, clarity, sharp mind", "confusion, brutality, chaos"));
        cards.add(new TarotCard("Two of Swords", "difficult choices, indecision, stalemate", "lesser of two evils, no right choice, confusion"));
        cards.add(new TarotCard("Three of Swords", "heartbreak, suffering, grief", "recovery, forgiveness, moving on"));
        cards.add(new TarotCard("Four of Swords", "rest, restoration, contemplation", "restlessness, burnout, stress"));
        cards.add(new TarotCard("Five of Swords", "unbridled ambition, win at all costs, sneakiness", "lingering resentment, desire to reconcile, forgiveness"));
        cards.add(new TarotCard("Six of Swords", "transition, leaving behind, moving on", "emotional baggage, unresolved issues, resisting transition"));
        cards.add(new TarotCard("Seven of Swords", "deception, trickery, tactics and strategy", "coming clean, rethinking approach, deception"));
        cards.add(new TarotCard("Eight of Swords", "imprisonment, entrapment, self-victimization", "self acceptance, new perspective, freedom"));
        cards.add(new TarotCard("Nine of Swords", "anxiety, hopelessness, trauma", "hope, reaching out, despair"));
        cards.add(new TarotCard("Ten of Swords", "failure, collapse, defeat", "can't get worse, only upwards, inevitable end"));
        cards.add(new TarotCard("Page of Swords", "curiosity, restlessness, mental energy", "deception, manipulation, all talk"));
        cards.add(new TarotCard("Queen of Swords", "complexity, perceptiveness, clear mindedness", "cold hearted, cruel, bitterness"));
        cards.add(new TarotCard("Knight of Swords", "action, impulsiveness, defending beliefs", "no direction, disregard for consequences, unpredictability"));
        cards.add(new TarotCard("King of Swords", "head over heart, discipline, truth", "manipulative, cruel, weakness"));
        cards.add(new TarotCard("Ace of Wands", "creation, willpower, inspiration, desire", "lack of energy, lack of passion, boredom"));
        cards.add(new TarotCard("Two of Wands", "planning, making decisions, leaving home", "fear of change, playing safe, bad planning"));
        cards.add(new TarotCard("Three of Wands", "looking ahead, expansion, rapid growth", "obstacles, delays, frustration"));
        cards.add(new TarotCard("Four of Wands", "community, home, celebration", "lack of support, transience, home conflicts"));
        cards.add(new TarotCard("Five of Wands", "competition, rivalry, conflict", "avoiding conflict, respecting differences"));
        cards.add(new TarotCard("Six of Wands", "victory, success, public reward", "excess pride, lack of recognition, punishment"));
        cards.add(new TarotCard("Seven of Wands", "perseverance, defensive, maintaining control", "give up, destroyed confidence, overwhelmed"));
        cards.add(new TarotCard("Eight of Wands", "rapid action, movement, quick decisions", "panic, waiting, slowdown"));
        cards.add(new TarotCard("Nine of Wands", "resilience, grit, last stand", "exhaustion, fatigue, questioning motivations"));
        cards.add(new TarotCard("Ten of Wands", "accomplishment, responsibility, burden", "inability to delegate, overstressed, burnt out"));
        cards.add(new TarotCard("Page of Wands", "exploration, excitement, freedom", "lack of direction, procrastination, creating conflict"));
        cards.add(new TarotCard("Queen of Wands", "courage, determination, joy", "selfishness, jealousy, insecurities"));
        cards.add(new TarotCard("Knight of Wands", "action, adventure, fearlessness", "anger, impulsiveness, recklessness"));
        cards.add(new TarotCard("King of Wands", "big picture, leader, overcoming challenges", "impulsive, overbearing, unachievable expectations"));
    }

    public DrawnCard drawCard(){
        Random random = new Random();
        int index = random.nextInt(78);
        TarotCard card = cards.get(index);
        boolean isReversed = random.nextBoolean();
        return new DrawnCard(card, isReversed);
    }
}
