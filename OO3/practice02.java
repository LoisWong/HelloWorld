package OO3;

import java.util.Scanner;

public class practice02 {
	final static double PI = 3.14159;
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		double r,s,v;
		r = keyboard.nextFloat();
		s = 4 * PI * Math.pow(r, 2);
		v = (4 / 3) * PI * Math.pow(r, 3);
		System.out.println("its surface area and volume are " + s + " " + v);
	}
}
