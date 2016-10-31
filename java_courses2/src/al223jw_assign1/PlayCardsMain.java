package al223jw_assign1;

public class PlayCardsMain {
    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println(deck.deckSize());
        deck.shuffle();

        for(int i = 0; i < 15; i++)
        {
            Card card = deck.handOutNextCard();
            System.out.println("Card "+i+": "+ card.getRank() + " " + card.getSuite()+ " " + card.getValue());
        }
        System.out.println("Cards in deck: " + deck.deckSize());
    }
}
