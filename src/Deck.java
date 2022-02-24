public class Deck {
    // PROPERTIES
    private Card[] cards;
    

    // CONSTRUCTORS
    public Deck() {}

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
}
/*
10. Make a Deck Object that contains a Card array to contain all cards.
11. Write a default constructor for your deck object that create 52 cards by default.
12. Write a constructor that specifies the number of suits , the number of cards per suit, Boolean for
ace high/low with low ace value=1.
13. Make a private method called makeDeck(). That populates a class level
variable which is an array of cards with the need fields.
14. Make a toString()method that list the cards in the deck from top to
bottom.
15.Write an accessor that returns the number of cards in the deck.
16.Write an accessor called getCardAt() that returns the Card at position
x in the deck
17. Write an mutator called shuffle () that shuffle/randomizes the order
of the cards.*/