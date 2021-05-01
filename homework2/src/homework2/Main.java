package homework2;

import homework2.Business.InstructorManager;
import homework2.Business.StudentManager;
import homework2.Business.UserManager;
import homework2.Entity.DatabaseLogger;
import homework2.Entity.Instructor;
import homework2.Entity.Student;
import homework2.Entity.User;
import homework2.log.EmailLogger;
import homework2.log.FileLogger;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setFirstName("Ali");
		student1.setLastName("akçay");
		student1.setSchoolNumber("123654");

		Student student2 = new Student();
		student2.setFirstName("ahmet");
		student2.setLastName("akçay");
		student2.setSchoolNumber("658974");

		Student student3 = new Student();
		student3.setFirstName("mehmet");
		student3.setLastName("akçay");
		student3.setSchoolNumber("654785");

		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setBranch("Java");

		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Sezgin");
		instructor2.setLastName("Demiroğ");
		instructor2.setBranch("C#");

		UserManager userManager = new UserManager(new FileLogger());
		userManager.add(student1);
		userManager.add(student2);
		userManager.add(student3);
		userManager.add(instructor1);
		userManager.add(instructor2);

		System.out.println();
		StudentManager studentManager = new StudentManager(new DatabaseLogger());
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);

		System.out.println();
		InstructorManager instructorManager = new InstructorManager(new EmailLogger());
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);

		System.out.println("\n --- ADDING MULTIPLE --- ");
		Student[] students = { student1, student2, student3 };
		studentManager.addMultiple(students);
		System.out.println();

		Instructor[] instructors = { instructor1, instructor2 };
		instructorManager.addMultiple(instructors);
		System.out.println();

		User[] users = { student1, student2, student3, instructor1, instructor2 };
		userManager.addMultiple(users);

	}

}
