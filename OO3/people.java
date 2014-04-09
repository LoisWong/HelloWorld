package OO3;

public class people {

	private String name;
	private String gender;
	private float height;
	private float weight;
	
	//constructor method
	public people(String nm,String g,float h,float w){
		name=nm;
		gender=g;
		height=h;
		weight=w;	
	}
	
	public void display(){
		System.out.println("Name: "+ name);
		System.out.println("Gender: "+ gender);
		System.out.println("Height: "+ height);
		System.out.println("Weight: "+ weight);
	}
	
	public static void main(String agrs[]){
		people freshPP = new people("Bob","Male",188.0f,73.0f);
		freshPP.display();
	}
}
