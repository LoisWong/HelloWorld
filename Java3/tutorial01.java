package Java3;

public class tutorial01 {
	public static void main(String[] args){
		int classSize;
		classSize = Integer.parseInt(args[0]);
		if (classSize < 150)
			System.out.println("This class is small");
		else
			System.out.println("This class is large");
	}
	
}
