public class Card {

    // PROPERTIES
    private String color;
    private String rank;
    private String symbol;
    private int value;
    private  boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color="";
        this.rank="";
        this.symbol="";
        this.value=0;
        this.playable=false;
    }
    //Override Constructor
    public void Cards(String color, String rank, String symbol, int value, boolean playable){
        this.color=color;
        this.rank=rank;
        this.symbol=symbol;
        this.value=value;
        this.playable=playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    public String getRank() {
        return this.rank;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public int getValue(){
        return this.value;
    }
    public boolean getPlayable(){
        return this.playable;
    }
    public String getReport(){
        String report="Color: "+ this.color + "\n"+"Rank: "+ this.rank + "\n"+"Symbol: "+ this.symbol + "\n"+"Value: "+ this.value + "\n"+"Playable: "+ this.playable + "\n"; 
        return report;
    }
    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
  

    // METHODS
   // public static void toString(){

    }

/*6. Write a mutator method for Value and Playable
9. Write an equals method that compares the current card against another card to determine if they are
equal.*/