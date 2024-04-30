package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	//text-user interface

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher melissa = new Teacher(2, "Melissa", 700);
		Teacher tim = new Teacher(3, "Tim", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(melissa);
		teacherList.add(tim);
		
		Student samara = new Student(1, "Samara", 4);
		Student rakul = new Student(2, "Rakul", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(samara);
		studentList.add(rakul);
		studentList.add(rabbi);
		
		School ghs = new School(teacherList, studentList);
		
		samara.payFees(5000);
		rakul.payFees(6000);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

		System.out.println("-----Making SCHOOL PAY SALARY-----");
		
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName() +
				" and now has $" + ghs.getTotalMoneyEarned());
		
		tim.receiveSalary(tim.getSalary());
		System.out.println("GHS has spent for salary to " + tim.getName() +
				" and now has $" + ghs.getTotalMoneyEarned());
		
		System.out.println(samara);
		System.out.println(lizzy);
	}

}
