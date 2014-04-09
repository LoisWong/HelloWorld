package Java3;

public class lab06 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		for (int n = 1; n <= a; n++){
			for (int m = 1; m <= b; m++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
