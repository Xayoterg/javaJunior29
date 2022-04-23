package lesson11.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Payer implements IPayer{
    private String name;
    private ArrayList<ICard>handsCards=new ArrayList<>();
    private boolean inGame=true;

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public String getName() {
        return name;
    }

    public Payer(String name){
        this.name=name;
    }
    @Override
    public void adToCardHand(ICard card) {
        handsCards.add(card);

    }

    @Override
    public boolean needMoreCards() {
        Scanner scanner=new Scanner(System.in);
        System.out.println(name+  "вашы карты :");
        this.openHand();
        System.out.println("------------");
        System.out.println("нужнали еще карта");
        String answer=scanner.nextLine();
        if (answer.equalsIgnoreCase("да")){
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
      for (ICard card:handsCards){
          card.open();
      }

    }

    @Override
    public int cauntValeusHand() {
        int values=0;
        for (ICard card:handsCards){
            values=values+card.getValue();
        }
        return values;
    }
}
