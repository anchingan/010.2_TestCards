package testCards;

import java.util.Scanner;

public class TestCards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ShuffleCards cardSet = new ShuffleCards();
		int input;
		do {
			System.out.print("Options: 1)remain cards , 2)get card, 3)發四副牌並印出, -1)Quit: ");
			input = scanner.nextInt();
			if (input == 1) 
				System.out.println(cardSet);
			else if (input == 2) {
				cardSet.printCard(cardSet.getCard());
				System.out.println("");
			}
			else if (input == 3) {
				cardSet = new ShuffleCards();
				for (int i = 0; i < 52; i++) {
					if (i % 13 == 0) 
						System.out.printf("Card set %d:", i / 13 + 1);
					cardSet.printCard(cardSet.getCard());
					if (i % 13 == 12)
						System.out.println("");
				}
			}
			else if (input == -1)
				break;
			else
				System.out.println("Input error!");
		} while (true);
		
	}

}
