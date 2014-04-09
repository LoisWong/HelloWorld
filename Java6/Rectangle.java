package Java6;

public class Rectangle {
	double width, height;
	double perimeter, area;
	double[] coordinate = new double[2];
	
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;
	}
	
	public double getPerimeter(){
		perimeter = (width + height)*2;
		return perimeter;
	}
	
	public double getArea(){
		area = width * height;
		return area;
	}
	
	public double[] getCoordinates(){
		coordinate[0] = width / 2;
		coordinate[1] = height / 2;
		return coordinate;
	}
	
	public void writeRectangle(){
		System.out.printf("This rectangle's width is %.2f, height is %.2f, perimeter is %.2f, area is %.2f, center coordinates are (%.2f, %.2f)",width, height, perimeter, area, coordinate[0], coordinate[1]);
	}
}
