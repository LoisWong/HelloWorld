package Java3;

public class lab01 {
	public static void main(String[] args){
		int num;
		num = Integer.parseInt(args[0]);
		if (num == 0) {
			System.out.println(num + " is zero.");
		}
		else if (num % 2 == 0) {
				System.out.println(num + " is an even number.");
			 }
		else
			System.out.println(num + " is an odd number.");
	}

}
