package app;

import service.StudentService;

public class Main {
	public static void main(String[] args) {
		StudentService service=new StudentService();
		service.createStudent();
	}
}
