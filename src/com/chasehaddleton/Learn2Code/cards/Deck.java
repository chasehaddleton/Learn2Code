package com.chasehaddleton.Learn2Code.cards;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    Card[] cards = new Card[52];
    int position = 0;

    public Deck() {
        int i = 0;

        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards[i++] = new Card(suit, value);
            }
        }
    }

    public void shuffleDeck() {
        Random rnd = ThreadLocalRandom.current();

        for(int i =0; i < 100_000; i++) {
            int a  = rnd.nextInt(52);
            int b  = rnd.nextInt(52);

            Card temp = cards[a];
            cards[a] = cards[b];
            cards[b] = temp;
        }
    }

    // Returns the next card on the deck
    public Card getNextCard(){
        return cards[position++];
    }
}