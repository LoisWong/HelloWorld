package Java5;

import java.util.Scanner;

public class Tut {
	public static void main(String[] args){
		String surname;
		String firstname;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Surname:");
		surname = scan.nextLine();
		
		System.out.println("Firstname:");
		firstname = scan.nextLine();
		
		System.out.println("Date of Birth:(dd-mm-yyyy)");
		String dateString = scan.nextLine();
		
		int day = 1;
		int month = 1;
		int year = 1900;
		try {
			Scanner dateScan = new Scanner(dateString);
			dateScan.useDelimiter("-");//"[-\t\n\f\r]"
			day = dateScan.nextInt();
			month = dateScan.nextInt();
			year = dateScan.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Input error!");
		}
		
		System.out.printf("%s %s was born on %d %d %d", surname, firstname, day, month, year);
		
	}

}