package blackjack.domain.gamer.role;

import blackjack.domain.card.Card;
import blackjack.domain.gamer.BettingMoney;

public final class Dealer extends Role {
    private static final String NAME = "딜러";
    private static final int DEALER_STAND_CONDITION = 16;

    public Dealer() {
        super(NAME);
        bettingMoney = BettingMoney.of(0, 0);
    }

    @Override
    public void addCard(Card card) {
        if (getScore() > DEALER_STAND_CONDITION) {
            return;
        }

        cardGroup.addCard(card);
    }

    @Override
    public boolean isAddable() {
        return getScore() <= DEALER_STAND_CONDITION;
    }
}
