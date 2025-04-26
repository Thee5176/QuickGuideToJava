package part9_OOP.card;

public class Card {
    private final String suit; // e.g., "Hearts", "Diamonds", "Clubs", "Spades"
    private final String rank; // e.g., "2", "3", ..., "10", "Jack", "Queen", "King", "Ace"

    // Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter methods
    public String getSuit() {
        return this.suit;
    }
    public String getRank() {
        return this.rank;
    }

    public boolean equals(int mode, Card card) {
        boolean sameRank = this.getRank().equals(card.getRank());
        boolean sameSuit = this.getRank().equals(card.getSuit());

        if(mode == 0) {
            return sameRank && sameSuit;
        } else if (mode == 1) {
            return sameRank;
        } else if (mode == 2) {
            return sameSuit;
        } else {
            return false;
        }
    }

    // Method to display the card
    public void displayCard() {
        System.out.println(rank + " of " + suit);
    }
}
