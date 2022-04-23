package lesson11.blackjack;

public interface IPayer {
    void adToCardHand(ICard card);

    boolean needMoreCards();

    void openHand();

    int cauntValeusHand();

    boolean isInGame();

    void setInGame(boolean inGame);

    String getName();
}
