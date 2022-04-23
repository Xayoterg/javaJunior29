package lesson11.blackjack;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();

        Payer payer = new Payer("  вася ");
        Payer payer1 = new Payer("  петя ");
        Dealer dealer = new Dealer();


        blackJack.addPayer(payer1);
        blackJack.addPayer(payer);
        blackJack.addPayer(dealer);


        blackJack.dealTwoCards();
        blackJack.dealAalCards();
        blackJack.printWinner();
    }
}
