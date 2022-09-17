package com.java.pratice;
import java.util.Scanner;

class client{
	public String name;
	public int order;
	public int payment;
	public int dept=1000;
	public int get_receive(int payment){
		return payment-dept;
	}
}
public class Program1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		client c1=new client();
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Hello! "+name);
		System.out.println("Enter Your Order");
		int order=sc.nextInt();
		System.out.println("You ordered "+order+" package");
		System.out.println("Enter Your Payment");
		int payment=sc.nextInt();
		int totalamount=c1.get_receive(payment);
		if(totalamount>0) {
			System.out.println("you have to pay "+totalamount);
		}else if(totalamount==0) {
			System.out.println("you don't have to pay");
		}else {
			System.out.println("I have to give you "+totalamount);
		}
	}
	
}