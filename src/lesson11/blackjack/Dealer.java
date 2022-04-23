package lesson11.blackjack;

public class Dealer extends Payer implements IDealer{

    public Dealer(){
        super("  крупье");
    }

    @Override
    public boolean needMoreCards() {
       if (cauntValeusHand()<18){
           return true;
       }
       return false;
    }
}
