package OO3;

import java.util.Scanner;

public class practice04 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		int num;
		while(true){
			num = keyboard.nextInt();
			System.out.print("Integer number: "+ num + " ");
			if (num > 0){
				System.out.print("It's a plus value. ");
			}
			else if (num < 0){
				System.out.print("It's a minus value. ");
			}
			else
				System.out.print("It's 0. ");
		}
	}

}
