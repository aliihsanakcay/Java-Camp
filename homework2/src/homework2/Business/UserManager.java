package homework2.Business;

import homework2.Entity.Instructor;
import homework2.Entity.Student;
import homework2.Entity.User;
import homework2.log.BaseLogger;

public class UserManager {
	
	BaseLogger logger;
	
	public UserManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add(User user) {
		System.out.println(user.getFirstName() + " => user added.");
		logger.log("\"User added.\"");
	}
	
	public void add(Instructor user) {
		System.out.println(user.getFirstName() + " => added.");
		logger.log("\"User added.\"");
	}
	
	public void add(Student user) {
		System.out.println(user.getFirstName() + " => added.");
		logger.log("\"User added.\"");
	}
	
	public void addMultiple(User [] users) {
		for (User user : users) {
			System.out.println(user.getFirstName() + " => user added.");
			logger.log("\"User added.\"");
		}
	}
	
	public void addMultiple(Student [] users) {
		for (Student student : users) {
			System.out.println(student.getFirstName() + " => user added.");
			logger.log("\"Student added.\"");
		}
	}
	
	public void addMultiple(Instructor [] users) {
		for (Instructor instructor : users) {
			System.out.println(instructor.getFirstName() + " => user added.");
			logger.log("\"Instructor added.\"");
		}
	}
	
}

