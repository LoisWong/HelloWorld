package Java4;

public class Homework3 {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		int[][] triangle = new int[N][N];
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i)
					triangle[i][j] = 1;
				else
					triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
				
				if(triangle[i][j] < 10)
					System.out.print(triangle[i][j] + "   ");
				else if(triangle[i][j] < 100)
					System.out.print(triangle[i][j] + "  ");
				else
					System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}

}
