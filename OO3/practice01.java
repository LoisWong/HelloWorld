package OO3;

import java.util.Scanner;

public class practice01 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		float l,h,a;
		l = keyboard.nextFloat();
		h = keyboard.nextFloat();
		a = l * h / 2;
		System.out.println(a);
	}
}
