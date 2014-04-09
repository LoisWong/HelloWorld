package OO3;

import java.util.Scanner;

public class pactice05 {
	public static void main(String agrs[]){
		Scanner keyboard = new Scanner(System.in);
		int num;
		while (true) {
			num = keyboard.nextInt();
			if (num >= 0) {
				if (num % 7 == 0) {
					System.out.print("The integer value: " + num
							+ " It can be divided by 7.");
				} else
					System.out.print("The integer value: " + num
							+ " It cannot be divided by 7.");
			} else
				System.out.print("The integer value: " + num
						+ " It is not a positive value.");
		}

	}

}
