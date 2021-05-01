package homework2.Business;

import homework2.Entity.Student;
import homework2.log.BaseLogger;

public class StudentManager extends UserManager {
	
	public StudentManager(BaseLogger logger) {
		super(logger);
	}

	@Override
	public void add(Student user) {
		System.out.println(user.getFirstName() + " => student added.");
		logger.log("\"Student added.\"");
	}
	
	@Override
	public void addMultiple(Student[] users) {
		super.addMultiple(users);
	}
}
