package Java4;

public class Lab1 {
	public static void main(String[] args) {
		int N = args.length;
		double sum = 0, aver;
		double[] num = new double[N];
		for (int i = 0; i < N; i++){
			
			//reverse the order and print out
			num[i] = Double.parseDouble(args[N-i-1]);
			System.out.print(num[i] + " ");
			//Step of calculate the average value
			sum = sum + num[i];
			
		}
		aver = sum / N;
		System.out.println();
		System.out.println("The average number is: " + aver);
		
		for (int i = 0; i < N; i++){
			if (num[i] < aver)
				System.out.print(i + " ");
		}
	}
}
