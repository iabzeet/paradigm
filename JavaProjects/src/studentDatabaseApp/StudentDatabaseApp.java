package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//ask how many new students we want to add
		//create an array of objects
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//create n number of new students
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println("\n");
		}
		
		for (int n=0; n<numOfStudents; n++) {
			System.out.println(students[n].toString());
			System.out.println("\n");
		}
		
	}

}
