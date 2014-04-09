package Java5;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args){
		
		System.out.println("Please input the scale of array:");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt(); 
		String[] testing = new String[n];
		
		System.out.println("Please input content of the array:(Seprate by each element by ';')");
		String content = keyboard.next();
		
		Scanner arrayScanner = new Scanner(content);
		arrayScanner.useDelimiter(";");
		int i = 0;
		while(arrayScanner.hasNext()){
			testing[i] = arrayScanner.next();
			i++;
	    }
		
		System.out.println("Which element would you like to check?");
		i = keyboard.nextInt();
		
		if (i < n) {
			System.out.print(testing[i]);
		}
	}

}
