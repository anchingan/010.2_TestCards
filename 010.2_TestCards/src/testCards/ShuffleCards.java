package testCards;

public class ShuffleCards extends Cards {
	
	public ShuffleCards() {
		shuffleCard();
	}
	
	void shuffleCard() {
		int tempIndex, temp;
		for (int i = 0; i < 52; i++) {
			tempIndex = (int)(Math.random() * 52);
			temp = this.cardsPool[i];
			this.cardsPool[i] = this.cardsPool[tempIndex];
			this.cardsPool[tempIndex] = temp;
		}
	}
	
	public int remainCards() {
		return (52 - this.getCardIndex);
	}
	
	@Override
	public int getCard() {
		if (this.remainCards() == 0) {
			newCards();
			shuffleCard();
		}
		return this.cardsPool[getCardIndex++]; 
	}
	
	public String toString(){
		String[] suitPrint = {"Club ", "Diamond ", "Heart ", "Spade "};
		String cardPrint = "";
		for (int i = getCardIndex; i < this.cardsPool.length; i++) {
			int suit = this.cardsPool[i] / 13, point = this.cardsPool[i] % 13 + 1;
			cardPrint += suitPrint[suit] + Integer.toString(point) + " ";
		}
		return cardPrint;
	}

}
