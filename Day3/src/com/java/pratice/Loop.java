package com.java.pratice;

public class Loop {
	public static void main(String[] args) {
		/*
		 * int i=0; while(i<=100) { if(i%2==0) { System.out.println(i); } i++; }
		 */
		
		/*//for loop
		int i = 0;
		for (;i<=100;) {
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		//do_while loop
		
		/*int j=0;
		do {
			System.out.println(j);
		
			j++;
		}while(j<10);*/
		
		// control Statement
		//break------->terminate the iteration
		//continue----->skip the iteration
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+"\t");
		}
	}
}
