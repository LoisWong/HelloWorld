package Java3;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args){
		int i;
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Please input an odd number:");
			i = keyboard.nextInt();
			if (i % 2 == 0) {
				System.out.println("It's an even number! Try again.");
			} else {
				//calcute how many lines need to be filled
				for (int line = 0; line <= (i / 2); line++) {
					//calcute how many spaces and blocks are needed
					for (int row = 0; row < ((i / 2) - line); row++)
						System.out.print(" ");
					for (int pyramid = 0; pyramid < (line * 2 + 1); pyramid++) 
						System.out.print("*");
					System.out.println();
				}
			}
		}
	}

}
