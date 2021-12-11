package client;

import model.Student;
import service.StudentService;

public class Main {
	public static void main(String[] args) {
		Student st=new Student("name",45);
		StudentService sv=new StudentService();
		sv.nameValidation(st);
		
	}
}
