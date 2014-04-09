package Java3;

public class lab05 {
	public static void main(String[] args){
		int a = 1, n = Integer.parseInt(args[0]);
		for (int i = 2; i <= n; i++){
			a = a * i;
		}
		System.out.println("The factorial of " + n + " is " + a);
	}

}
