package com.java.pratice;

import java.util.Scanner;

public class Entity {
	public static void main(String[] args) {
		Setter_Getter sg=new Setter_Getter();
		sg.setNum1(20,3);
		
		
		double result=sg.getNum();
		System.out.println("result is "+result);
}
}
