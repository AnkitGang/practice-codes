public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		if(den == 0) {
			//error
		}
		else
			this.den = den;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.num = num;
		simplify();
	}
	public void setDenominator(int den) {
		if(den == 0) {
			//error
			return;
		}
		this.den = den;
		simplify();
	}
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return den;
	}
	
	private void simplify() {
		int small = Math.min(num, den);
		for(int i=small; i>=2; i--) {
			if((num % i == 0) && (den % i == 0)) {
				num/=i;
				den/=i;
				break;
			}
		}
	}
	
	//changes in new fraction
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum = (f1.num * f2.den) + (f1.den * f2.num);
		int newDen = f1.den * f2.den;
		Fraction f = new Fraction(newNum, newDen);
		return f;
	}
	
	//changes in f1
	public void add(Fraction f2) {
		this.num = (this.num * f2.den) + (f2.num * this.den);
		this.den = this.den * f2.den;
		simplify();
	}
	
	//changes in f1
	public void multiply(Fraction f2) {
		this.num = this.num * f2.num;
		this.den = this.den * f2.den;
		simplify();
	}
	
	public void print() {
		if(den == 1) {
			System.out.println(num);
		}
		else {
			System.out.println(num + "/" + den);
		}
	}
}
