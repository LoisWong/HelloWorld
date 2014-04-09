package Java4;

public class Homework2 {
	public static void main(String[] args)
	{
		String str = new String(args[0]);
		int length = str.length();
		char[] sta = new char[length];
		int[] upper = new int[26];
		int[] lower = new int[26];
		for(int i=0;i<26;i++)
		{
			upper[i]=0;
			lower[i]=0;
		}
		for(int i=0;i<length;i++)
		{
			sta[i] = str.charAt(i);
			if(sta[i]=='A')
				upper[0]++;
			else if(sta[i]=='B')
				upper[1]++;
			else if(sta[i]=='C')
				upper[2]++;
			else if(sta[i]=='D')
				upper[3]++;
			else if(sta[i]=='E')
				upper[4]++;
			else if(sta[i]=='F')
				upper[5]++;
			else if(sta[i]=='G')
				upper[6]++;
			else if(sta[i]=='H')
				upper[7]++;
			else if(sta[i]=='I')
				upper[8]++;
			else if(sta[i]=='J')
				upper[9]++;
			else if(sta[i]=='K')
				upper[10]++;
			else if(sta[i]=='L')
				upper[11]++;
			else if(sta[i]=='M')
				upper[12]++;
			else if(sta[i]=='N')
				upper[13]++;
			else if(sta[i]=='O')
				upper[14]++;
			else if(sta[i]=='P')
				upper[15]++;
			else if(sta[i]=='Q')
				upper[16]++;
			else if(sta[i]=='R')
				upper[17]++;
			else if(sta[i]=='S')
				upper[18]++;
			else if(sta[i]=='T')
				upper[19]++;
			else if(sta[i]=='U')
				upper[20]++;
			else if(sta[i]=='V')
				upper[21]++;
			else if(sta[i]=='W')
				upper[22]++;
			else if(sta[i]=='X')
				upper[23]++;
			else if(sta[i]=='Y')
				upper[24]++;
			else if(sta[i]=='Z')
				upper[25]++;
			else if(sta[i]=='a')
				lower[0]++;
			else if(sta[i]=='b')
				lower[1]++;
			else if(sta[i]=='c')
				lower[2]++;
			else if(sta[i]=='d')
				lower[3]++;
			else if(sta[i]=='e')
				lower[4]++;
			else if(sta[i]=='f')
				lower[5]++;
			else if(sta[i]=='g')
				lower[6]++;
			else if(sta[i]=='h')
				lower[7]++;
			else if(sta[i]=='i')
				lower[8]++;
			else if(sta[i]=='j')
				lower[9]++;
			else if(sta[i]=='k')
				lower[10]++;
			else if(sta[i]=='l')
				lower[11]++;
			else if(sta[i]=='m')
				lower[12]++;
			else if(sta[i]=='n')
				lower[13]++;
			else if(sta[i]=='o')
				lower[14]++;
			else if(sta[i]=='p')
				lower[15]++;
			else if(sta[i]=='q')
				lower[16]++;
			else if(sta[i]=='r')
				lower[17]++;
			else if(sta[i]=='s')
				lower[18]++;
			else if(sta[i]=='t')
				lower[19]++;
			else if(sta[i]=='u')
				lower[20]++;
			else if(sta[i]=='v')
				lower[21]++;
			else if(sta[i]=='w')
				lower[22]++;
			else if(sta[i]=='x')
				lower[23]++;
			else if(sta[i]=='y')
				lower[24]++;
			else if(sta[i]=='z')
				lower[25]++;
		}
		System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		for(int i=0;i<26;i++)
		{
			System.out.print(upper[i]+" ");
		}
		System.out.println("\n" + "a b c d e f g h i j k l m n o p q r s t u v w x y z");
		for(int i=0;i<26;i++)
		{
			System.out.print(lower[i]+" ");
		}
	}
}
