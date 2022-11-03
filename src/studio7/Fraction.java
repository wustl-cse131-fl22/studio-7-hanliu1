package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private double fraction=numerator/denominator/1.0;
	
	public Fraction (int n, int d) {
		this.numerator=n;
		this.denominator=d;
		this.fraction=n/d/1.0;
	}
	
	public double sum(Fraction fraction) {
		return this.fraction+fraction.fraction;
	}
	
	public double product(Fraction fraction) {
		return this.fraction*fraction.fraction;
	}
	
	public double reciprocal() {
		return 1.0/this.fraction;
	}

	public String simplify() {
		for (int i=1;i<=this.numerator;i++) {
			for (int j=1;j<=this.denominator;j++) {
				if (i/j/1.0==this.fraction) {
					return i+"/"+j;
				}
			}
		}
		return this.numerator+"/"+this.denominator;
	}
}

