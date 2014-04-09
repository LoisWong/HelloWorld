package Java3;

public class lab02 {
	public static void main(String[] args){
		int grade;
		grade = Integer.parseInt(args[0]);
		if (grade <= 100 && grade >= 85)
			System.out.println("HD");
		else if (grade <= 84 && grade >= 75)
				 System.out.println("D");
			 else if (grade <= 74 && grade >= 65)
				      System.out.println("C");
			 	  else if (grade <= 64 && grade >= 50)
			 		       System.out.println("P");
			 	  	   else
			 	  		   System.out.println("F");
	}

}
