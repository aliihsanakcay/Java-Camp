package homework2.Entity;

import homework2.log.BaseLogger;

public class DatabaseLogger extends BaseLogger {

	@Override
	public void log(String message) {
		System.out.println(message + " logged to database.");
	}
	
}
