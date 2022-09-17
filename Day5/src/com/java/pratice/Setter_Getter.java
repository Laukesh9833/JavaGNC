package com.java.pratice;

public class Setter_Getter {
	private double num1;
	private double num2;
	private double result;
	
	
	public void setNum1(int num1, int num2) {
		this.num1 = num1;
		this.num2= num2;
	}
	
	public double getNum() {
		if (num2==0) {
			return 1;
		}else {
			return num1/num2;
		}
	}
	
}	
