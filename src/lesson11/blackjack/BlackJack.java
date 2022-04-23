package lesson11.blackjack;

import java.util.ArrayList;

public class BlackJack implements IBlackjack {
    private Koloda koloda = new Koloda();
    private ArrayList<IPayer> payers = new ArrayList<>();

    @Override
    public void addPayer(IPayer payer) {
        payers.add(payer);

    }

    @Override
    public void dealTwoCards() {
        for (IPayer payer : payers) {
            payer.adToCardHand(koloda.getRandomCard());
            payer.adToCardHand(koloda.getRandomCard());
        }

    }

    @Override
    public void dealAalCards() {
        for (IPayer payer : payers) {
            while (payer.needMoreCards()) {
                payer.adToCardHand(koloda.getRandomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        for (IPayer payer : payers) {
            if (payer.cauntValeusHand() > 21) {
                payer.setInGame(false);
            }
        }
        if (cauntPlayerInGame() == 0) {
            for (IPayer payer : payers) {
                if (payer instanceof Dealer) {
                    System.out.println("-----победитель" + payer.getName());
                    payer.openHand();
                    return;
                }
            }
        }

        int winnerValeu = 0;
        for (IPayer payer : payers) {
            if (payer.isInGame() && payer.cauntValeusHand() > winnerValeu) {
                winnerValeu = payer.cauntValeusHand();
            }
        }
        for (IPayer payer : payers) {
            if (payer.isInGame() && payer.cauntValeusHand() == winnerValeu) {
                System.out.println("-----победитель" + payer.getName());
                payer.openHand();
                return;
            }
        }


    }

    public int cauntPlayerInGame() {
        int count = 0;
        for (IPayer payer : payers) {
            if (payer.isInGame()) {
                count++;
            }
        }
        return count;
    }
}
