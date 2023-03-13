public class ComplexNumbers {
	private int real;
	private int imag;
	
	public ComplexNumbers(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void add(ComplexNumbers c2) {
		this.real = this.real + c2.real;
		this.imag = this.imag + c2.imag;
	}
	
	public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
		int newReal = c1.real + c2.real;
		int newImag = c1.imag + c2.imag;
		ComplexNumbers c3 = new ComplexNumbers(newReal, newImag);
		return c3;
	}
	
	public void multiply(ComplexNumbers c2) {
		this.real = (this.real * c2.real) - (this.imag * c2.imag);
		this.imag = (this.real * c2.imag) + (this.imag * c2.real);
	}
	
	public ComplexNumbers conjugate() {
		this.imag = -1 * this.imag;
		ComplexNumbers c4 = new ComplexNumbers(this.real, this.imag);
		return c4;
	}
	
	public void print() {
		if(this.imag < 0)
			System.out.println(real + " " + imag + "i");
		else
			System.out.println(real + " + " + imag + "i");
	}	
}
