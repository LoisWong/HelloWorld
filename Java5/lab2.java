package Java5;
import java.util.Scanner;

public class lab2 {
	public static void main(String[] args){
		System.out.println("Please input principle and rate:");
		Scanner keyboard = new Scanner(System.in);
		
		double p = keyboard.nextDouble();
		double r = keyboard.nextDouble();
		
		for(int y = 1; y <11; y++){
			double pr = p * r; 
			double sum = p + pr;
			System.out.printf("Year %02d-principle: $%.2f interest: $%.2f Total: $%.2f %n", y,p,pr,sum);
			p = sum;
		}
	}

}
