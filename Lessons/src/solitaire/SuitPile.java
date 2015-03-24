package solitaire;

class SuitPile extends CardPile {

	SuitPile(final int x, final int y) {
		super(x, y);
	}

	public boolean canTake(final Card aCard) {
		if (empty()) {
			return aCard.rank() == 0;
		}
		Card topCard = top();
		return (aCard.suit() == topCard.suit())
				&& (aCard.rank() == 1 + topCard.rank());
	}
}