package com.chasehaddleton.Learn2Code.cards;

public class Card {
    Suit suit;
    Value value;

    public Card (Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }
}