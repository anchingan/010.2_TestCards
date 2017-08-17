package testCards;

public class Cards {
	protected int[] cardsPool;
	protected int getCardIndex;
	
	public Cards() {
		newCards();
	}
	
	//Generate new card set.
	protected void newCards() {
		cardsPool = new int[52];
		for (int i = 0; i < cardsPool.length; i++)
			cardsPool[i] = i;
		getCardIndex = 0;
	}
	
	//Get first card of the card set.
	public int getCard() {
		if (getCardIndex == this.cardsPool.length)
			newCards();
		
		return cardsPool[getCardIndex++]; //
	}
	
	//Print suit and point of the card.
	public void printCard(int i) {
		String[] suitPrint = {"Club", "Diamond", "Heart", "Spade"};
		int suit = i / 13, point = i % 13 + 1;
		System.out.printf("%s %2d ", suitPrint[suit], point);
	}

}
