package com.java.pratice;
class user{
	public String fname;
	public String lname;
	public int order;
	public int payment;
	public int MobNo;
	public String showFullName1() {
		return fname+" "+lname;
	}
	public void showFullName2() {
		System.out.println(fname+" "+lname);
	}
}
public class program2{
	
	public static void main(String[] args) {
		user c1=new user();
		c1.fname="Virat";
		c1.lname="Kohli";
		System.out.println(c1.showFullName1());
		c1.showFullName2();
	}
}