package Java3;

import java.util.Scanner;
public class tutorial02 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int button;
		button = keyboard.nextInt();
		switch(button){
			case 1: System.out.println("cola is served");
				break;
			case 2: System.out.println("lemonade is served"+',');
				break;
			case 3: System.out.println("water is served"+',');
				break;
			case 6: System.out.println("cola and lemonade is served"+',');
				break;
			case 9: System.out.println("refund");
				break;
			default:System.out.println("No such beverage");
				break;
		}
	}
}
