package OO3;

public class people2 {
	String name;
	String gender;
	private float height;
	private float weight;
	
	void setHeight(float h) {
		this.height = h;
	}
	float getHeight() {
		return this.height;
	}
	void setWeight(float w) {
		this.weight = w;
	}
	float getWeight() {
		return this.weight;
	}
	public static void main(String[] args){
		people2 sample = new people2();
		sample.name = "john";
		sample.gender = "male";
		sample.setHeight(187.4f);
		sample.setWeight(73.4f);
		System.out.println("Name : " + sample.name);
		System.out.println("gender : " + sample.gender);
		System.out.println("height : " + sample.getHeight());
		System.out.println("weight : " + sample.getWeight());
	}

}
