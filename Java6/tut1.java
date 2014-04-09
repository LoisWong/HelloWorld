package Java6;

public class tut1 {
	public static void main(String[] args) { 
		System.out.println(modifyNumber(3,-4));
	}
	public static int modifyNumber(int num, int modifier) { 
		if (modifier < 0) {
			num = num - 2; 
		}
		doubleThis(num);//=2, but num has not been change.
		num = doubleThis(modifier + num);
		return num;
	}
	public static int doubleThis(int num) {
	  return (num + num);
	}

}
