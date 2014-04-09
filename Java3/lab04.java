package Java3;

public class lab04 {
	public static void main(String[] arg){
		String s = arg[0].toUpperCase();
		//public char charAt(int index), index of the character will be returned
		char grade = s.charAt(0);
		switch(grade){
			case 'H':
				System.out.println("Your score is between 85-100.");
				break;
			case 'D':
				System.out.println("Your score is between 75-84.");
				break;
			case 'C':
				System.out.println("Your score is between 65-74.");
				break;
			case 'P':
				System.out.println("Your score is between 50-64.");
				break;
			case 'F':
				System.out.println("Your score is between 0-49.");
				break;
			default:
				break;
		}
	}
}
