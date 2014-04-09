package Java3;

public class lab03 {
	public static void main(String[] args){
		double mass,height,BMI;
		mass = Double.parseDouble(args[0]);
		height = Double.parseDouble(args[1]);
		BMI = mass / Math.pow(height, 2);
		
		if (BMI < 18.5)
			System.out.println("Underweight");
		else if (BMI < 25)
			System.out.println("Normal weight");
		else if (BMI < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obses");
	}
}
