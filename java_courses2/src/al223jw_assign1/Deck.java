package al223jw_assign1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck = new ArrayList<>();

    public Deck()
    {

        for(Card.Suite suite: Card.Suite.values())
        {
            int value = 1;
            for(Card.Rank rank: Card.Rank.values())
            {
                deck.add(new Card(suite, rank, value));
                value++;
            }
        }
    }


    public void shuffle()
    {
        if(deck.size() == 52)
        {
            Collections.shuffle(deck);
        }
        System.out.println("Cant shuffle deck, deck dose not contain 52 cards.");
    }

    public Card handOutNextCard()
    {
        Card handOut = deck.get(0);
        deck.remove(0);
        return handOut;
    }

    public int deckSize()
    {
        return deck.size();
    }
}
