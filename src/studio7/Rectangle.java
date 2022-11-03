package studio7;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2*(this.length)+2*(this.width);
	}
	
	public boolean isSquare() {
		if (this.length==this.width) {
			return true;
		}
		else {
			return false;
		}
	}

}
