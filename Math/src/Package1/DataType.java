package Package1;

public class DataType {
	private double num1;
	private double num2;
	private double Additon;
	private double Subtraction;
	private double Multiplication;
	private double Division;
	
	public DataType(double n1,double n2) {
		num1=n1;
		num2=n2;
	}
	
	
	public double getAdditon() {
		return Additon;
	}

	public void setAdditon() {
		Additon = num1+num2;
	}

	public double getSubtraction() {
		return Subtraction;
	}

	public void setSubtraction() {
		Subtraction = num1-num2;
	}

	public double getMultiplication() {
		return Multiplication;
	}

	public void setMultiplication() {
		Multiplication = num1*num2;
	}

	public double getDivision() {
		return Division;
	}

	public void setDivision() {
		if(num2==0) {
			Division=0;
		}else {
			Division=num1/num2;
		}
	}

	
}
