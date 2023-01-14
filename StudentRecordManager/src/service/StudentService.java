package service;

import java.util.Scanner;

import dow.Studentdow;
import model.Student;

public class StudentService {
	public void createStudent() {
		Studentdow dow=new Studentdow();
		Student s =new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		s.setName(name);
		System.out.println("Enter your number:");
		String number=sc.nextLine();
		s.setNumber(number);
		boolean addStudent = dow.addStudent(s);
		if(addStudent) {
			System.out.println("Data Added Sucessfully");
		}else {
			System.out.println("Please Try Again!!!!");
		}
	}
}
