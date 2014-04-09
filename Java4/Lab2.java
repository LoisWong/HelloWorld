package Java4;

public class Lab2 {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		double[][] numTable = new double[N][N];
		for (int m = 0; m < N; m++){
			for (int n = 0; n < N; n++){
				numTable[m][n] = Double.parseDouble(args[m*N+n+1]);
				System.out.print(numTable[m][n] + " ");
			}
			System.out.println();
		}
	}
}
