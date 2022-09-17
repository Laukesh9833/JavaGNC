package com.java.pratice;

public class Constructor1 {
	private int num1;
	private int num2;
	private int result;
	private String name;
	
	Constructor1(){
		System.out.println("hello world");
	}
	Constructor1(int n1, int n2, int result, String name){
		this.num1=n1;
		this.num2=n2;
		this.result=result;
		this.name=name;
		System.out.printf("num1=%d \nnum2=%d \nresult=%d \nname=%s",num1,num2,result,name);
	}
	Constructor1(int n1){
		System.out.println("\nnum1="+n1);
	}
}
