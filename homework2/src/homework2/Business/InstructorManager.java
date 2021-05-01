package homework2.Business;

import homework2.Entity.Instructor;
import homework2.log.BaseLogger;

public class InstructorManager extends UserManager {
	
	public InstructorManager(BaseLogger logger) {
		super(logger);
	}

	@Override
	public void add(Instructor user) {
		System.out.println(user.getFirstName() + " => instructor added.");
		logger.log("\"Instructor added.\"");
	}
	
	@Override
	public void addMultiple(Instructor[] users) {
		super.addMultiple(users);
	}
	
}
