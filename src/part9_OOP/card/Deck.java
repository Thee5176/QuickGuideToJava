package part9_OOP.card;

import java.util.Arrays;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.175 draw 5 cards and check for Flush
public class Deck {
    private Card[] cards;
    private int topCardIndex;

    // Constructor
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        cards = new Card[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                cards[index++] = new Card(suit, rank);
            }
        }
        topCardIndex = 51; // Index of the top card
    }

    // Method to shuffle the deck
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    // Method to deal a card
    public Card dealCard() {
        if (topCardIndex < 0) {
            System.out.println("No more cards in the deck.");
            return null;
        }
        return cards[topCardIndex--];
    }

    public Card[] dealCard(int count) {
        if (topCardIndex < count){
         System.out.println("Not enough card in the deck.");
         return null;
        }
        return Arrays.copyOfRange(cards, 0, count);
    }

    // Method to display the deck
    public void displayDeck() {
        for (int i = 0; i <= topCardIndex; i++) {
            cards[i].displayCard();
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Dealing a card:");
        Card[] dealtCard = deck.dealCard(5);

        Card prevCard = dealtCard[0];
        boolean isFlush = true;

        for (Card card: dealtCard) {
            if(!card.equals(2, prevCard)){
                isFlush = false;
            }
            card.displayCard();
            prevCard = card;
        }

        if(isFlush){
            System.out.println("You have a flush!");
        } else {
            System.out.println("No flush.");
        }
    }
}
