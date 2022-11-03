package studio7;

public class Complex {
	private double a;
	private double b;

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public String complexNumber() {
		return this.a + " + " + this.b + "i";
	}

	public String sum(Complex number) {
		double sumA = this.a + number.a;
		double sumB = this.b + number.b;
		return sumA + " + " + sumB + "i";
	}
	
	public String product(Complex number) {
		double newA = this.a * number.a - this.b * number.b;
		double newB = this.a * number.b + this.b * number.a;
		return newA + " + " + newB + "i";
	}

}
