package com.chasehaddleton.Learn2Code;

import com.chasehaddleton.Learn2Code.cards.Card;
import com.chasehaddleton.Learn2Code.cards.Deck;

public class Main {

    public static void main(String[] args) {
        /*Car myCar = new Car(200.0, 4, 20.0, 55.0, "Black");
        Car yourCar = new Car(250.0, 4, 20.0, 55.0, "White");

        System.out.println("My car can drive " + myCar.range() + " km.");

        if (myCar.getTopSpeed() < yourCar.getTopSpeed()) {
            System.out.println("Your car is faster");
        } else {
            System.out.println("My car is faster");
        }

        Coins penny = Coins.Penny;
        System.out.println("A penny is worth " + penny.getDollarValue() + " dollars.");
        Coins loonie = Coins.Loonie;
        System.out.println("A loonie is worth " + loonie.getDollarValue() + " dollars.");*/

        Deck deck = new Deck();
        deck.shuffleDeck();

        Card card1 = deck.getNextCard();
        Card card2 = deck.getNextCard();

        if (card1.getValue().ordinal() < card2.getValue().ordinal()) {
            System.out.println("Card 2 is greater");
            System.out.println("The greater card is: " + card2.getValue().getName() + " of " + card2.getSuit());
        } else if (card1.getValue().ordinal() > card2.getValue().ordinal()) {
            System.out.println("Card 1 is greater");
            System.out.println("The greater card is: " + card1.getValue().getName() + " of " + card1.getSuit());
        }

        /*for (int i = 0; i < 52; i++) {
            Card nextCard = deck.getNextCard();
            System.out.println("The next card is: " + nextCard.getValue() + " " + nextCard.getSuit());
        }*/
    }
}
