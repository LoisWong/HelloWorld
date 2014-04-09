package Java4;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int M,N;
		System.out.print("Please assign the size of array: ");
		M = keyboard.nextInt();
		N = keyboard.nextInt();
		System.out.print("Please input "+ (M*N) +" values into the array:");
		float[] sumC = new float[N];//N columns
		float[] sumR = new float[M];//M rows
		float[][] num = new float[M][N];
		for (int m = 0; m < M; m++){
			for (int n = 0; n < N; n++){
				num[m][n] = keyboard.nextFloat();
				sumR[m] = sumR[m] + num[m][n];//sum value of m row
				System.out.print(num[m][n] + " ");
			}
			System.out.println();
		}
		
		for (int n = 0; n < N; n++){
			for (int m = 0; m < M; m++){
				sumC[n] = sumC[n] + num[m][n];//sum value of n column
			}
		}
		
		System.out.println("The sums of row are: ");
		for (int m = 0; m < M; m++){
			System.out.print(sumR[m] + " ");
		}
		System.out.println("\n" + "The sums of column are: ");
		for (int n = 0; n < N; n++){
			System.out.print(sumC[n] + " ");
		}
		
	}
}
