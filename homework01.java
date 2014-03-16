import java.util.Scanner;

public class homework01 {
	public static void main(String[] args){
		while(true){
			System.out.println("Please input the radius of the circle:");
			Scanner keyboard = new Scanner(System.in);
			
			double radius,area,circumference,diameter;
			radius = keyboard.nextFloat();
			area = Math.PI * Math.pow(radius, 2);
			diameter = 2 * radius;
			circumference = Math.PI * diameter;
			
			System.out.println("The area of the circle is: "+ area);
			System.out.println("The circumference of the circle is: "+ circumference);
			System.out.println("The length of the diameter is: "+ diameter);
		}
		
	}

}
