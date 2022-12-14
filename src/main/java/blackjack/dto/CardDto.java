package blackjack.dto;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDto {
    private final String shape;
    private final String number;

    public CardDto(String shape, String number) {
        this.shape = shape;
        this.number = number;
    }

    public static CardDto of(Card card) {
        return new CardDto(card.getCardShape().getName(), card.getCardNumber().getName());
    }

    public static List<CardDto> of(CardGroup cardGroup) {
        List<CardDto> cardsDto = new ArrayList<>();
        for (Card card : cardGroup.getCards()) {
            addOpenCard(cardsDto, card);
        }

        return Collections.unmodifiableList(cardsDto);
    }

    private static void addOpenCard(List<CardDto> cardsDto, Card card) {
        if (card.isOpen()) {
            cardsDto.add(of(card));
        }
    }

    public String getCard() {
        return number + shape;
    }
}
