package al223jw_assign1;

import java.text.DecimalFormat;

public class Play123Main {

    public static void main(String[] args) {

        int win = 0;
        int lose = 0;

        final int plays = 10000;

        for(int i = 0; i < plays; i++)
        {
            Deck deck = new Deck();
            deck.shuffle();

            int counter = 1;
            if(play123(counter, deck))
            {
                win++;
            }
            else
            lose++;
        }

        double probability = ((double)win / plays) * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Wins: "+ win);
        System.out.println("Losses: " + lose);
        System.out.println("The probability of winning is: "+df.format(probability)+"%");
    }

    private static boolean play123(int counter, Deck deck)
    {
        for(int i = 0; i < 52; i++)
        {
            if(counter > 3)
            {
                counter = 1;
            }

            Card card = deck.handOutNextCard();

            if(card.getValue() == counter)
            {
                return false;
            }
            counter++;
        }
       return true;
    }
}
